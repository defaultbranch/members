The backend should be written using:

- Maven 3.9 (see <https://maven.apache.org/docs/history.html>)
- Spring Boot 4 (see <https://spring.io/blog/category/releases>)
- Kotlin 2.3 (see <https://kotlinlang.org/docs/releases.html>)
- JVM 25 (LTS) (see <https://adoptium.net/temurin/releases>)

In addition, the project should use:

- JUnit5

To accomplish this, there should be a `pom.xml`.

# Smoke Testing

If there are no source files yet, please add:

- a `HelloWorld.kt` HTTP GET endpoint controller that returns a text string "Hello, world!"
- a `Main.kt` for running the Spring Boot application with the controller
- a `HelloWorldTest.kt` that uses Kotlin test with the chosen JUnit underneath

And ensure:

- `mvn verify` passes
- the resulting JAR is executable
