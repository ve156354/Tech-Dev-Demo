#FROM artmgt01.atpco.org:9091/atpco-jdk-1.8.0.45:1.0
FROM java:8

USER 1001

EXPOSE 8080

RUN mkdir -p /opt/local

RUN chmod -R ug+rw /opt/local

RUN curl -kv https://raw.githubusercontent.com/ve156354/Tech-Dev-Demo/master/hai-spring-boot/hai-spring-boot-docker-0.1.0.jar -o /opt/local/app.jar

#ADD hai-spring-boot-docker-0.1.0.jar  app.jar

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/local/app.jar"]
