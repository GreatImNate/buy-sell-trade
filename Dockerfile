FROM openjdk:17
VOLUME /tmp
COPY target/*.jar application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]