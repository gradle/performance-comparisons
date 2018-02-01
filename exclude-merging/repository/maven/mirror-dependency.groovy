def (gid, aid, version) = args.length==1?args[0].split(':'):args
gid = gid.replace('.', '/')
def dir = new File("$gid/$aid/$version")
['pom', 'pom.md5', 'pom.sha1'].each { ext ->
   def pomUrl = new URL("https://repo1.maven.org/maven2/$gid/$aid/$version/$aid-${version}.$ext")
   println "Fetching $pomUrl"
   def pom = pomUrl.bytes
   dir.mkdirs()
   new File(dir, "$aid-${version}.$ext").bytes = pom
}

['jar', 'jar.md5', 'jar.sha1'].each { ext ->
   def refJar = new File("junit/junit/4.12/junit-4.12.$ext")
   new File(dir, "$aid-${version}.$ext").bytes = refJar.bytes
}

