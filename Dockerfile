FROM eclipse-temurin:21-jdk-alpine
LABEL authors="willi"
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]