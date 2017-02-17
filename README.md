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
an unfair comparison, but it's for an important reason: Maven's incremental compiler is completely broken and will miss changes. An example of serious bug can be [found here](https://issues.apache.org/jira/browse/MCOMPILER-209).


