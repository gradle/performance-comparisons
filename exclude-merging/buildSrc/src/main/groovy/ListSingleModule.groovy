import groovy.transform.CompileStatic
import org.gradle.api.artifacts.ComponentMetadataListerDetails
import org.gradle.api.artifacts.ComponentMetadataVersionLister
import org.gradle.api.artifacts.repositories.RepositoryResourceAccessor

@CompileStatic
class ListSingleModule implements ComponentMetadataVersionLister {
    private final RepositoryResourceAccessor repositoryResourceAccessor
    private final boolean maven

    @javax.inject.Inject
    public ListSingleModule(RepositoryResourceAccessor accessor, boolean maven) {
        this.repositoryResourceAccessor = accessor
        this.maven = maven
    }

    @Override
    void execute(final ComponentMetadataListerDetails details) {
        def id = details.moduleIdentifier
        List<String> versions = []
        def basePath = maven ? id.group.replace('.', '/') : id.group
        repositoryResourceAccessor.withResource("${basePath}/${id.name}/versions.txt") {
            it.withReader { reader ->
                reader.eachLine { line ->
                    if (line) {
                        def split = line.split(';')
                        def module = split[0]
                        split = module.split(':')
                        def version = split[2]
                        versions << version
                    }
                }
            }
        }
        details.listed(versions)
    }
}

