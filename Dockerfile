FROM java:8
ADD /target/*.jar zuul-server.jar
ENTRYPOINT ["java","-jar","zuul-server.jar"]