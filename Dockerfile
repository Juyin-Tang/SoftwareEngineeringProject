FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/1_inclass_assignment-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-cp", "app.jar", "Main"]
