FROM openjdk:21-jdk-slim

MAINTAINER github/carloshenriquefs

COPY ./target/shirt-0.0.1-SNAPSHOT.jar /app/shirt-0.0.1-SNAPSHOT.jar

WORKDIR /app

ENTRYPOINT ["java", "-jar", "shirt-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
