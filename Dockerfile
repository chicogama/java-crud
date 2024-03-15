FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/java-crud-0.0.1.jar java-crud-0.0.1.jar
EXPOSE 8085
CMD [ "java", "-jar", "java-crud-0.0.1.jar" ]