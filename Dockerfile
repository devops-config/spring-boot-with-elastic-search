FROM eclipse-temurin:20-jdk-alpine
ADD target/spring-boot-with-elastic-search-2.0.jar spring-boot-with-elastic-search-2.0.jar
EXPOSE 12309
ENTRYPOINT ["java","-jar","spring-boot-with-elastic-search-2.0.jar"]
