FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/app-2.0.4.RELEASE.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
