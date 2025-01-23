# Use OpenJDK 23 as the base image
FROM eclipse-temurin:21

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/wiredash-apis-1.0.0.jar /app/wiredash-apis.jar

# Expose the port that the Spring Boot application uses
EXPOSE 8080

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "wiredash-apis.jar"]