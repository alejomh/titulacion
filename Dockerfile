FROM tomcat:9.0.45-jdk15-adoptopenjdk-openj9
EXPOSE 8080
ADD target/devops-integration.jar /usr/local/tomcat/webapps/devops-integration.jar