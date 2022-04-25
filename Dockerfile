# define base docker image
FROM openjdk:8
LABEL maintainer="Aman Sahu"
ADD target/FirstWebProj-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
ENTRYPOINT ["java","-jar","springboot-docker-demo.jar"]