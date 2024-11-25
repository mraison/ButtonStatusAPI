FROM openjdk:latest

ARG JAR_FILE=./API/target/*.jar

WORKDIR /

COPY ./API/target/* /

EXPOSE 8080

ENV CASSANDRA_IP=172.18.0.1
ENV CASSANDRA_PORT=9042
ENV CASSANDRA_USER=cassandra
ENV CASSANDRA_PW=cassandra

CMD java -jar /API-0.0.1-SNAPSHOT.jar -Dspring.cassandra.contact-points=172.18.0.1:9042
