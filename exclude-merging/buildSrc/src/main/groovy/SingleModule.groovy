import groovy.transform.CompileStatic
import org.gradle.api.artifacts.ComponentMetadataSupplier
import org.gradle.api.artifacts.ComponentMetadataSupplierDetails
import org.gradle.api.artifacts.repositories.RepositoryResourceAccessor

@CompileStatic
class SingleModule implements ComponentMetadataSupplier {
    private final RepositoryResourceAccessor repositoryResourceAccessor
    private final boolean maven

    @javax.inject.Inject
    public SingleModule(RepositoryResourceAccessor accessor, boolean maven) {
        this.repositoryResourceAccessor = accessor
        this.maven = maven
    }

    void execute(ComponentMetadataSupplierDetails details) {
        def id = details.id
        def status = [:]
        def basePath = maven ? id.group.replace('.', '/') : id.group
        repositoryResourceAccessor.withResource("${basePath}/${id.module}/versions.txt") {
            it.withReader { reader ->
                reader.eachLine { line ->
                    if (line) {
                        def split = line.split(';')
                        def module = split[0]
                        def st = split[1]
                        status[module] = st
                    }
                }
            }
        }
        def st = status[id.toString()]
        if (st) {
            details.result.status = status[id.toString()]
            details.result.statusScheme = ['integration', 'milestone', 'candidate', 'release']
        }
    }
}

