FROM openjdk:11-ea-9-jre
ADD common-web-app-0.0.1-SNAPSHOT.jar /apps/common-web-app/common-web-app.jar
EXPOSE 10000
ENTRYPOINT ["java", "-jar","/apps/common-web-app/common-web-app.jar"]