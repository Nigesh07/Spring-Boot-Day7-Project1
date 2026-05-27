# Spring Boot Hello World Sample

A simple Spring Boot project demonstrating a basic REST controller and project structure.

## Project Overview

This sample is part of the Day 7 Spring Boot learning exercises. It includes:

- A Spring Boot application entry point
- A REST controller under `src/main/java/com/day7/helloworld/controller`
- A standard Maven build setup
- A unit test class for basic verification

## Getting Started

### Prerequisites

- Java 17 (or a compatible JDK)
- Maven 3.8+

### Build and Run

From the project root, run:

```powershell
mvn clean package
mvn spring-boot:run
```

Or run the packaged JAR:

```powershell
java -jar target/day7proj1-0.0.1-SNAPSHOT.jar
```

## Project Structure

- `pom.xml` - Maven configuration file with Spring Boot dependencies
- `src/main/java` - application source code
- `src/test/java` - test source code
- `target/` - build output directory

## REST Endpoint

The sample includes a controller that exposes a simple endpoint. Once the application is running, open:

```text
http://localhost:8080/
```

You should see a hello world style response from the application.

## Testing

Run unit tests with:

```powershell
mvn test
```

## Notes

This project is intended for learning Spring Boot basics and can be extended with additional controllers, services, and persistence layers as needed.
