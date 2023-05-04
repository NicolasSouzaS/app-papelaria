FROM openjdk:17
EXPOSE 8080
ADD target/app-papelaria.jar app-papelaria.jar
ENTRYPOINT ["java","-jar","app-papelaria.jar"]