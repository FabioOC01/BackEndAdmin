package com.tecsup.backendadmin.Service;

import com.tecsup.backendadmin.Modelos.FileMetadata;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileService {

    private static final String UPLOAD_DIR = "uploads/";

    // Crear el directorio de carga si no existe
    public FileService() {
        File directory = new File(UPLOAD_DIR);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    // Subir archivo
    public void uploadFile(MultipartFile file) throws IOException {
        Path path = Paths.get(UPLOAD_DIR + file.getOriginalFilename());
        Files.write(path, file.getBytes());
    }

    // Eliminar archivo
    public void deleteFile(String fileName) throws IOException {
        Path path = Paths.get(UPLOAD_DIR + fileName);
        Files.deleteIfExists(path);
    }

    // Actualizar archivo
    public void updateFile(String fileName, MultipartFile file) throws IOException {
        deleteFile(fileName);  // Primero, eliminamos el archivo existente
        uploadFile(file);  // Luego, subimos el nuevo archivo
    }

    // Listar archivos
    public List<FileMetadata> listFiles() {
        List<FileMetadata> files = new ArrayList<>();
        File folder = new File(UPLOAD_DIR);
        File[] fileList = folder.listFiles();

        if (fileList != null) {
            for (File file : fileList) {
                files.add(new FileMetadata(file.getName(), file.length()));
            }
        }
        return files;
    }
}