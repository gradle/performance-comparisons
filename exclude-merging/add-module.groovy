// This script can be used to add a "missing" dependency to the fake repositories
// It will try to find the "closest" matching dependency and copy metadata from it.
// If no dependency can be found, a dummy empty dependency will be created
//
// Usage: groovy some.group:artifact:1.4

@GrabResolver(name='gradle', root='https://repo.gradle.org/gradle/libs-releases-local/')
@Grab("org.gradle:gradle-core:6.1.1")
@Grab("com.google.guava:guava:30.0-jre")
import org.gradle.util.VersionNumber

def usage() {
	System.err.println("Please call this script with a GAV coordinate notation: group:artifact:version")
	System.exit(-1)
}
if (!args) {
   usage()
}
def (group, name, version) = args[0].split('[:/]')
if (!group || !name) {
   usage()
}

def mvn = "repository/maven/${group.replace('.', '/')}/${name}"
def ivy = "repository/ivy/${group}/${name}"

if (!lookup(mvn, version)) {
    if (!lookup(ivy, version)) {
        def mvnDir = new File(mvn, version)
    	println "Could not find any previous version of this library, creating a simple library entry at $mvn"
    	mvnDir.mkdirs()
    	new File(mvnDir, "$name-${version}.pom").text = new File("repository/template/newversion/template-newversion.pom").text
    		.replaceAll("%GROUP%", group)
    		.replaceAll("%NAME%", name)
    		.replaceAll("%VERSION%", version)
    	new File(mvnDir, "$name-${version}.jar").bytes =  new File("repository/template/newversion/template-newversion.jar").bytes
    }
}

boolean lookup(String path, String version) {
    File dir = new File(path)
    if (dir.exists() && dir.directory) {
        def lookupVersion = VersionNumber.parse(version)
        println "Found $path"
        def versions = []
        dir.listFiles().each {
        	if (it.name =~ /^[0-9]+/) {
        	    versions << it.name
        	}
        }
        if (versions) {
            versions.add(version)
			versions = versions.sort { a,b -> VersionNumber.parse(a) <=> VersionNumber.parse(b) }
			println versions
			int lookupIdx = versions.indexOf(version)
			def closest = versions[lookupIdx == 0 ? 1 : lookupIdx-1]
			println "Closest version is ${closest}"
			createNewVersion(new File(dir, closest), new File(dir, version))
        	return true
        }
    }
    return false
}

void createNewVersion(File source, File dest) {
    println("Creating $dest using $source as template")
    def targetVersion = dest.name
    def sourceVersion = source.name
    dest.mkdirs()
    source.listFiles().each {
        def targetFile = new File(dest, fixupName(it, sourceVersion, targetVersion))
        if (it.name.endsWith('.jar')) {
            targetFile.bytes = it.bytes
        } else if (it.name.endsWith('.pom')) {
            targetFile.bytes = it.text.replaceAll("<version>$sourceVersion</version>", "<version>$targetVersion</version>").bytes
        } else if (it.name.startsWith('ivy') && it.name.endsWith('.xml')) {
            targetFile.bytes = it.text.replaceAll("revision=\"$sourceVersion\"", "revision=\"$targetVersion\"").bytes
        }      
    }
}

String fixupName(File source, String srcVersion, String targetVersion) {
    source.name.replace(srcVersion, targetVersion)
}
