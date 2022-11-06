FROM openjdk:8
EXPOSE 8088
ADD /target/ProjetDevOps-1.0.jar  ProjetDevOps-1.0.jar
ENTRYPOINT ["java", "-jar", "ProjetDevOps-1.0.jar"]