FROM 172.30.80.252:5000/springboot-sample/springboot-sti
EXPOSE 8080 
RUN curl http://ttdevbld:8081/nexus/content/repositories/snapshots/net/atpco/datatable/fareclass-datatable-service/1.0.0/fareclass-datatable-service-1.0.0.jar -o /opt/openshift/app.jar 
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/openshift/app.jar"]