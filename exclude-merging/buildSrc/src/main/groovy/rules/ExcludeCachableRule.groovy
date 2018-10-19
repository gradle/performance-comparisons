package rules

import groovy.transform.CompileStatic
import org.gradle.api.artifacts.CacheableRule
import org.gradle.api.artifacts.ComponentMetadataContext
import org.gradle.api.artifacts.ComponentMetadataRule
import org.gradle.api.artifacts.repositories.RepositoryResourceAccessor

import javax.inject.Inject

@CompileStatic
@CacheableRule
class ExcludeCachableRule implements ComponentMetadataRule {

    private final RepositoryResourceAccessor accessor

    @Inject
    ExcludeCachableRule(RepositoryResourceAccessor accessor) {
        this.accessor = accessor
    }

    @Override
    void execute(ComponentMetadataContext componentMetadataContext) {
        Map<String, Set<String>> excludes = parseExcludes()
        Thread.sleep(10)
        if (!excludes.isEmpty()) {
            componentMetadataContext.details.allVariants {
                it.withDependencies {
                    it.removeAll {
                        def exclude = false
                        def modules = excludes.get(it.group)
                        if (modules != null && (modules.contains(it.name) || modules.contains('*'))) {
                            exclude = true
                        } else {
                            modules = excludes.get('*')
                            if (modules != null && (modules.contains(it.name))) {
                                exclude = true
                            }
                        }
                        exclude
                    }
                }
            }
        }
    }

    private HashMap<String, Set<String>> parseExcludes() {
        Map<String, Set<String>> excludes = new HashMap<>()
        accessor.withResource('exclude/excludes.txt') {
            it.withReader { reader ->
                reader.eachLine { line ->
                    if (line) {
                        def split = line.split(':')
                        def group = '*'
                        def module = '*'
                        if (split.length == 2) {
                            if (split[0]) {
                                group = split[0]
                            }
                            module = split[1]
                        } else {
                            group = split[0]
                        }
                        def modules = excludes.get(group)
                        if (modules == null) {
                            modules = new HashSet<String>()
                            excludes.put(group, modules)
                        }
                        modules.add(module)
                    }
                }
            }
        }
        excludes
    }
}
