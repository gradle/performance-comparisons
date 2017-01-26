# A single, large project

This test project is a single, large project, containing 50000 source files.

# Instructions

Assuming you have installed `gradle-profiler`, as described in the top-level readme.

For Gradle:

```
gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --gradle-version 3.3
```

(replace 3.3 with the version of Gradle you want to test, or a path to a local install)

For Apache Maven:

```
export MAVEN_HOME=/path/to/apache-maven
export MAVEN_OPTS="-Xms2g -Xmx2g"
gradle-profiler gradle-profiler --scenario-file performance.scenarios --project-dir . --benchmark --maven
```
