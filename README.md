# Maven Dagger 2 Lombok Example

[![CircleCI](https://circleci.com/gh/jeremywall/maven-dagger2-lombok-example/tree/main.svg?style=svg)](https://circleci.com/gh/jeremywall/maven-dagger2-lombok-example/tree/main)

---

UPDATE (2022-10-10): I'm done with Dagger. It's hard to use and the way it does things never felt right to me. I much prefer how Guice does things by extending the Guice Module class and placing all dependencies inside the Module. Therefore, I've moved all my personal projects to [Toothpick](https://github.com/stephanenicolas/toothpick). Toothpick uses modules like Guice and is not reflection based. It's the best of both worlds in my opinion so I'm no longer maintaining this Maven/Dagger2/Lombok example project but I will leave it here for reference.

---

Example of what I had to do to get a Maven based Java project to work with Dagger2 and Lombok at the same time.

In short, any class that contains a Lombok annotation can not be under `/src/main/java`. Instead, I store classes that use Lombok annotations under `/src/main/lombok`.

## How it Works

The Lombok Maven plugin executes during the generate sources phase of the Maven build process and delomboks the code located in `/src/main/lombok/*` and writes the plain vanilla Java code to `/target/generated-sources/delombok`.

## IntelliJ Configuration

Mark the following as a Source Folder in the module:

* `/src/main/java`
* `/src/main/lombok`

Initially when I first created this example code I would get IntelliJ IDE warnings about duplicate classes if the path `/target/generated-sources/delombok` was marked as a Generated Source Folder in the IntelliJ IDE's project module settings. Now I see the same path is automatically being added back as a Generated Source Folder by the IDE and the project still compiles and runs in the IDE. So I'm just going to say that your mileage may vary with this and if you get the duplicate classes warnings then try removing `/target/generated-sources/delombok` as a Generated Source Folder.

Additionally, I had to add `/target/generated-sources/annotations` as a Generated Source Folder as well for the IDE to work in the past but this too no longer seems to the be the case and removing this path as a Generated Source Folder still allows the IDE to compile and run the project. As with the matter above, if you have a problem try adding or removing `/target/generated-sources/annotations` as a Generated Source Folder.
