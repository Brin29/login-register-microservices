FROM openjdk:17-jdk-oracle

WORKDIR /root

COPY ./pom.xml /root
COPY ./.mvn /root/.mvn
COPY ./mvnw /root

COPY ./src /root/src

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/root/target/gateway-0.0.1-SNAPSHOT.jar"]