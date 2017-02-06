# Performance benchmarks for Gradle

This repository contains several synthetic projects that are used to benchmark Gradle against other build tools.

## Pre-requisites

Follow the instructions required to install the [Gradle profiler](https://github.com/gradle/gradle-profiler).

## Available projects

- A [single, large project](single-large-project)
- A [single, medium project](single-medium-project)
- A [large multi-project build](large-multiproject)
- A [small, multi-project build with libraries](api-vs-impl-small)
- A [small, multi-project build with a lot of exclusion rules](exclude-merging)

## Note about Maven performance scenarios

You will notice that for Apache Maven, we run `clean compile` instead of compile. It may, at first glance, look like
an unfair comparison, but it's not for a simple reason: both incremental builds and incremental compilation are broken
with Maven:

- incremental builds only recompile the class files which timestamps have changed, missing the dependents of those classes.
This is a serious issue because it leads to bad class files and can lead to `NoSuchMethodException` when running the code.
See [this class](https://github.com/apache/maven-shared/blob/trunk/maven-shared-incremental/src/main/java/org/apache/maven/shared/incremental/IncrementalBuildHelper.java)
- incremental compilation is also broken in many ways. An example of serious bug can be [found here](https://issues.apache.org/jira/browse/MCOMPILER-209).

It's also worth noting that we first made measurements with `compile` only (in fairness), but Gradle was always significantly faster,
except for the "multi-project" case, which is totally broken in Maven (it doesn't recompile downstream dependencies).

