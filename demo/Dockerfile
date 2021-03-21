FROM openjdk:11
ADD build/libs/*.jar docker-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "docker-demo.jar"]