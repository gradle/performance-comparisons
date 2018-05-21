import groovy.transform.CompileStatic
import org.gradle.api.artifacts.ComponentMetadataListerDetails
import org.gradle.api.artifacts.ComponentMetadataVersionLister
import org.gradle.api.artifacts.repositories.RepositoryResourceAccessor

@CompileStatic
class ListAllVersionsAtOnce implements ComponentMetadataVersionLister {
    private final RepositoryResourceAccessor repositoryResourceAccessor
    private final boolean maven

    @javax.inject.Inject
    public ListAllVersionsAtOnce(RepositoryResourceAccessor accessor, boolean maven) {
        this.repositoryResourceAccessor = accessor
        this.maven = maven
    }

    @Override
    void execute(final ComponentMetadataListerDetails details) {
        def id = details.moduleIdentifier
        List<String> versions = []
        repositoryResourceAccessor.withResource("versions.txt") {
            it.withReader { reader ->
                reader.eachLine { line ->
                    if (line) {
                        def split = line.split(';')
                        def module = split[0]
                        split = module.split(':')
                        def group = split[0]
                        def name = split[1]
                        def version = split[2]
                        if (id.group == group && id.name == name) {
                            versions << version
                        }
                    }
                }
            }
        }
        details.listed(versions)
    }
}

