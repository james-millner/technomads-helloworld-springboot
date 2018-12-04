FROM openjdk:8-jre-alpine
RUN apk --update --no-cache add curl

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/helloworld-0.0.1-SNAPSHOT.jar"]

COPY /helloworld-0.0.1-SNAPSHOT.jar /