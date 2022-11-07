FROM maven:3.8.2-jdk-8
ADD target/tpAchatFinal-1.0.jar tpAchatFinal-1.0.jar
ENTRYPOINT ["java","-jar","/tpAchat.jar"]