# Maven Dagger 2 Lombok Example

[![CircleCI](https://circleci.com/gh/jeremywall/maven-dagger2-lombok-example/tree/main.svg?style=svg)](https://circleci.com/gh/jeremywall/maven-dagger2-lombok-example/tree/main)

Example of what I had to do to get a Maven based Java project to work with Dagger 2 and Lombok at the same time.

## How it Works

The Lombok Maven plugin executes during the generate sources phase of the Maven build process and delomboks the code located in /src/main/lombok/* and writes the plain vanilla Java code to /target/generated-sources/delombok.

## IntelliJ Configuration

Mark the following as a Source Folder in the module:

* /src/main/java
* /src/main/lombok

Mark the following as a Generated Source Folder in the module:

* /target/generated-sources/annotations

Do *not* mark the following as a Generated Source Folder in the module:

* /target/generated-sources/delombok (if it is marked as a Source Folder of any kind it will cause an IDE warning about duplicate classes)
