From openjdk:8
copy ./target/SpringBootCloud-0.0.1.jar SpringBootCloud.jar
CMD ["java","-jar","SpringBootCloud.jar"]
EXPOSE 8080