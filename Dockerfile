FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/1_inclass_assignment-1.0-SNAPSHOT.jar app.jar
CMD ["sh", "-c", "echo 'Container started'; tail -f /dev/null"]
