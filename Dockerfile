FROM maven:3.8.2-jdk-8
ADD target/achat-1.0.jar achat-1.0.jar
ENTRYPOINT ["java","-jar","/achat.jar"]

