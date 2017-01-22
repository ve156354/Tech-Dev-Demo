FROM  docker.io/library/java

#FROM springboot:1.0

USER 1001

EXPOSE 8080

RUN mkdir -p /tmp/local

RUN chmod -R ug+rw /tmp/local

RUN curl -kv https://raw.githubusercontent.com/ve156354/Tech-Dev-Demo/master/hai-spring-boot/hai-spring-boot-docker-0.1.0.jar -o /tmp/local/app.jar

#ADD target/hai-spring-boot-docker-0.1.0.jar  /tmp/local/app.jar

#CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/local/app.jar"]
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/local/app.jar"]
