FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu

RUN mkdir /opt/app
COPY docker/app.jar /opt/app/app.jar
COPY --chown=app-user:app-user docker/app.yml /opt/app/
CMD ["java", "-jar", "/opt/app/app.jar", "server", "/opt/app/app.yml"]