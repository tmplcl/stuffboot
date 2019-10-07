FROM adoptopenjdk/openjdk11:latest
RUN mkdir /opt/app
COPY target/stuffboot.jar /opt/app
CMD ["java", "-jar", "/opt/app/stuffboot.jar"]