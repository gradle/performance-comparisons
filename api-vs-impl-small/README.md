# Small multiproject build with libraries

This test project is a small multiproject build, that demonstrates the effect of using the library plugin:
   - 4 projects
      - `app` is an application which depends on library `core`
      - `core` is a library which API depends on `domain`, and implementation depends on `utils`
      - `domain` is a library which has no dependency
      - `utils` is a library which has no dependency
   - each project has 500 source files

We then test 2 scenarios:

- making an ABI-compatible change in `utils` (an implementation dependency)
- making an ABI-breaking change in `utils` (an implementation dependency)

The incremental compiler of Gradle 3.4 is intentionally disabled, to show the impact of cleanly separating API and implementation on downstream dependencies. With the incremental compiler, it's even faster.
   
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


