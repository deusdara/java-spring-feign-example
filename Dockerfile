FROM maven:3.6.1-jdk-11-slim

LABEL MAINTAINER="deusdara"

WORKDIR /app

COPY target/java-spring-feign-example-1.0.0.jar app.jar
COPY java-spring-server-tests-example-1.0.0.jar server.jar

RUN ln -s /app/server.jar /etc/init.d/server

CMD ["sh", "-c", "service server start && java -jar /app/app.jar"]

EXPOSE 9001