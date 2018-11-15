FROM openjdk:8
ADD target/lab2aos-hw.jar lab2aos-hw.jar
EXPOSE 8000
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/lab2aos-hw.jar"]