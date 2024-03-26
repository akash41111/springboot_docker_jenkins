FROM openjdk:17
EXPOSE 9092
ADD target/springbootdocker.jar springbootdocker.jar
ENTRYPOINT ["java","-jar","springbootdocker.jar"]