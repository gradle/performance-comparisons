# Metadata rule supplier

This test project is a small multiproject build, that demonstrates the performance impact of using a custom metadata supplier.

# Instructions

This project requires building Gradle from sources, using the [`cc-ivy-status-selection` branch](https://github.com/gradle/gradle/tree/cc-ivy-status-selection).

## First use

The first time you execute this project, you need to generate the `versions.txt` file that is going to be used by the rule. You can execute:

```
gradle updateStatus
```

Which will scan the ivy repository and generate a metadata file that contains the status of each version for each module.


## Remote server simulator

A Groovy script, `http.groovy`, starts an HTTP server that simulates network latency. You can run it with:

```
groovy http.groovy <mean latency>
```

so running it with:

```
groovy http.groovy 25
```

would start a server that would simulate an average latency of 25ms for each request, so a latency between _0_ and _50_ms. It's worth noting that Groovy comes with a `servlet-api.jar` in its lib directory
which conflicts with the one required by this script, so it needs to be removed first.

## Testing

To simulate what would happen if a lot of integration versions are published, we need to bust the cache of artifacts. This means that you need to forcefully delete cache entries before running:

```
./cleancache.sh
```

which means you need to run the build with:

```
./cleancache.sh ; gl -Prefresh=true resolveDep -PuseHttp=true -PuseSupplier=true -g gradlehome
```

where `gl` is an alias to your local Gradle build installation. To compare **without** the supplier, use:


```
./cleancache.sh ; gl -Prefresh=true resolveDep -PuseHttp=true -g gradlehome
```

## The metadata supplier

The supplier implementation is:

```
class MP implements ComponentMetadataSupplier {
        Map<String, String> status = [:]
         
        void supply(ComponentMetadataSupplierDetails details) {
            def id = details.id
            if (status.isEmpty()) {
                details.repositoryResourceAccessor.withResource("versions.txt") {
                    it.withReader { reader ->
                        reader.eachLine { line ->
                            if (line) {
                               def (module, st) = line.split(';')
                               status[module] = st
                            }
                        }
                    }
                }
            }
            details.result.status = status[id.toString()]
            details.result.statusScheme = ['integration', 'milestone', 'candidate', 'release']
        }
}
```

The rule is created once per repository (so as many instances as there are projects, in practice), and going to be called for each module version. It provides the component status and status scheme, which is then used by Gradle to perform the selection. It's worth noting that this implementation uses a single file for _all modules_, but it is possible to use a different file for each version (but there would be more requests).


