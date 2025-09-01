FROM openjdk:17-jdk-slim
WORKDIR /todo-app
COPY target/todo-app-0.0.1-SNAPSHOT.jar todo-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","todo-app.jar"]
