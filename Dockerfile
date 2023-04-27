FROM openjdk:11
COPY target/docker-java-jar-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar", "--server.port=8080"]
EXPOSE 8080
