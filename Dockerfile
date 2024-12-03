# Usa una imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR generado por tu proyecto al contenedor
COPY target/BackEndAdmin-0.0.1-SNAPSHOT.jar /app/BackEndAdmin.jar

# Expone el puerto que usará la aplicación (Spring Boot usa 8080 por defecto)
EXPOSE 8080

# Define el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/BackEndAdmin.jar"]


ENV DATABASE_URL=postgresql://root:bZH98yPSSyWP3gNXXxpMoWigwmRtAs8O@dpg-ct782sjtq21c73bkdcf0-a.oregon-postgres.render.com/db_integrador
ENV DATABASE_USERNAME=root
ENV DATABASE_PASSWORD=bZH98yPSSyWP3gNXXxpMoWigwmRtAs8O