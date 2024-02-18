
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/springboot-mysql.jar /app/springboot-mysql.jar

# Specify the command to run on container startup
CMD ["java", "-jar", "springboot-mysql.jar"]

