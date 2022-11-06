FROM openjdk:8
EXPOSE 8088
ADD /target/tpAchatProject-1.0.jar  ProjetdevOps-1.0.jar
ENTRYPOINT ["java", "-jar", "ProjetdevOps-1.0.jar"]