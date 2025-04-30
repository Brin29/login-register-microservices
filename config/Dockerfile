FROM openjdk:17-jdk-oracle

WORKDIR /root

COPY ./pom.xml /root
COPY ./.mvn /root/.mvn
COPY ./mvnw /root

COPY ./src /root/src

EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/root/target/config-0.0.1-SNAPSHOT.jar"]