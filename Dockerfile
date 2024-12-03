# Usa una imagen base de OpenJDK 17 (puedes usar otra versión si es necesario)
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR de tu proyecto al contenedor
# Asegúrate de que el archivo JAR exista en el directorio 'target' después de compilar con Maven
COPY target/*.jar /app/BackEndAdmin.jar

# Expone el puerto que usará la aplicación (por defecto Spring Boot usa el puerto 8080)
EXPOSE 8080

# Define el comando para ejecutar la aplicación cuando se inicie el contenedor
ENTRYPOINT ["java", "-jar", "/app/mi-aplicacion.jar"]

ENV DATABASE_URL=postgresql://root:bZH98yPSSyWP3gNXXxpMoWigwmRtAs8O@dpg-ct782sjtq21c73bkdcf0-a.oregon-postgres.render.com/db_integrador
ENV DATABASE_USERNAME=root
ENV DATABASE_PASSWORD=bZH98yPSSyWP3gNXXxpMoWigwmRtAs8O