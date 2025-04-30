FROM openjdk:17-jdk-oracle

WORKDIR /root

COPY ./pom.xml /root
COPY ./.mvn /root/.mvn
COPY ./mvnw /root

COPY ./src /root/src

EXPOSE 9094
ENTRYPOINT ["java", "-jar", "/root/target/auth-service-0.0.1-SNAPSHOT.jar"]