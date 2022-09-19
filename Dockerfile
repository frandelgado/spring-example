FROM openjdk:18-ea-11-jdk-alpine3.15
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]