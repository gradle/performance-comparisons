package rules

import groovy.transform.CompileStatic
import org.gradle.api.artifacts.ComponentMetadataContext
import org.gradle.api.artifacts.ComponentMetadataDetails
import org.gradle.api.artifacts.ComponentMetadataRule

@CompileStatic
class StatusRule implements ComponentMetadataRule {
    @Override
    void execute(ComponentMetadataContext componentMetadataContext) {
        ComponentMetadataDetails details = componentMetadataContext.details
        details.statusScheme = ['snapshot', 'integration', 'candidate', 'release']

        def version = details.id.version
        if (version =~ /(?i).+(-|\.)(CANDIDATE|RC|BETA).*/) {
            details.status = 'candidate'
        }
        if (version =~ /(?i).+(-|\.)SNAPSHOT.*/) {
            details.status = 'snapshot'
        }
        // Seen coming from maven
        if (details.status == null) {
            details.status = 'release'
        }

        if (details.status == 'snapshot' || details.status == 'integration') {
            details.changing = true
        }

    }
}
