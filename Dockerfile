FROM openjdk:17
EXPOSE 8080
ADD target/springboot-gitapp.jar springboot-gitapp.jar
ENTRYPOINT ["java", "-jar", "springboot-gitapp.jar"]
