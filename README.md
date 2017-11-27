# Postgresmigs - A drop-in postgresql schema migrator

The goal of this project is to build a tiny drop-in Java service that will be able to update a Postgresql schema. 

## Development

The project uses maven to handle dependencies and is currently running in Java 8.

Run `mvn clean install` and run against a Java web container.

There is an included Dockerfile which can be used to create images with Alpine Linux, Java 8 and Jetty 9.4. 

## Features

### Completed


### Next to be implemented

  - Insert new row
  - Simple queries (AND only)


### Planned

  - Persisting settings to a location
  - Correct database session control
  - Creation of tables (support for text, number, date, timestamp types)
  - Adding columns
  - Removing colums

### Long-term plans

  - Front-end in Angular
  - Copy schema (From one DB to another)

### Stack

  - **Java 8**
  - **Jetty**
  - **Apline Linux**





