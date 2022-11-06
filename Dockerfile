FROM maven:3.8.2-jdk-8
ADD target/tpAchat-0.0.1-SNAPSHOT.jar tpAchat-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/tpAchatProject-0.0.1-SNAPSHOT.jar"]