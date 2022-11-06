FROM openjdk:8
EXPOSE 8089
ADD /target/devopsProject-1.0.jar devopsProject-1.0.jar
ENTRYPOINT ["java" , "-jar" , "devopsProject-1.0.jar"]