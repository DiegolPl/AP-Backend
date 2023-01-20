FROM openjdk:18-alpine
MAINTAINER default
COPY target/curriculum-0.0.1-SNAPSHOT.jar curriculum-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/curriculum-0.0.1-SNAPSHOT.jar"]