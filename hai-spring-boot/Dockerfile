FROM artmgt01.atpco.org:9091/atpco-jdk-1.8.0.45:1.0
EXPOSE 8080 
RUN curl http://ttdevbld:8081/nexus/content/repositories/snapshots/net/atpco/datatable/fareclass-datatable-service/1.0.0/fareclass-datatable-service-1.0.0.jar -o /opt/openshift/app.jar 
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/openshift/app.jar"]
