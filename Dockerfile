FROM maven:3.8.2-jdk-8
ADD target/tpAchat-1.0.jar tpAchat-1.0.jar
ENTRYPOINT ["java","-jar","/tpAchat.jar"]