FROM openjdk:8
ADD /task-manager-service-0.0.1-SNAPSHOT.jar task-manager-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
RUN bash -c 'touch /task-manager-service-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","task-manager-service-0.0.1-SNAPSHOT.jar"]