FROM openjdk
ADD target/Service-1-0.0.1-SNAPSHOT.jar /
expose 8082:8082
cmd ["java","-jar","Service-1-0.0.1-SNAPSHOT.jar"]