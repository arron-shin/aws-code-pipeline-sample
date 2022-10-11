FROM openjdk:11-jre-slim
EXPOSE 8080
COPY ./build/libs/spring-petclinic-kotlin-*.jar spring-petclinic-kotlin.jar
ENTRYPOINT ["java", "-jar", "/spring-petclinic-kotlin.jar"]
