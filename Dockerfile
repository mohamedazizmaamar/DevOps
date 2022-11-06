FROM openjdk:8
EXPOSE 8088
ADD /target/devopsProject-1.0.jar  devopsProject-1.0.jar
ENTRYPOINT ["java", "-jar", "devopsProject-1.0.jar"]