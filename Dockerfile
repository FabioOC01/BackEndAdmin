# Usa una imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR de tu proyecto al contenedor
# Asegúrate de que el archivo JAR exista en el directorio 'target' antes de construir la imagen
COPY target/mi-aplicacion.jar /app/mi-aplicacion.jar

# Expone el puerto que usará la aplicación (por defecto Spring Boot usa el puerto 8080)
EXPOSE 8080

# Define el comando para ejecutar la aplicación cuando se inicie el contenedor
ENTRYPOINT ["java", "-jar", "/app/mi-aplicacion.jar"]
