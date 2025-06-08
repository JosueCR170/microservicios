#Establecer la imagen de Docker para JavaRuntime
FROM openjdk:17-jdk-slim
#Copiar el archivo al contenedor
COPY target/clients-0.0.1-SNAPSHOT.jar clients-0.0.1-SNAPSHOT.jar

#Commandos para ejecutar el jar
ENTRYPOINT ["java","-jar","clients-0.0.1-SNAPSHOT.jar"]