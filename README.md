# Maven Dagger 2 Lombok Example

Example of what I had to do to get a Maven based Java project to work with Dagger 2 and Lombok at the same time.

## IntelliJ Configuration

Mark the following as a Source Folder in the module:

* /src/main/java
* /src/main/lombok

Mark the following as a Generated Source Folder in the module:

* /target/generated-sources/annotations

Do *not* mark the following as a Generated Source Folder in the module:

* /target/generated-sources/delombok
