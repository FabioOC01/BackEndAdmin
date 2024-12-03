package com.tecsup.backendadmin.Controlador;

import com.tecsup.backendadmin.Modelos.FileMetadata;
import com.tecsup.backendadmin.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @Autowired
    private FileService fileService;

    // Método para subir un archivo
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            fileService.uploadFile(file);
            return ResponseEntity.ok("File uploaded successfully!");
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Error uploading file: " + e.getMessage());
        }
    }

    // Método para eliminar un archivo por su nombre
    @DeleteMapping("/delete/{fileName}")
    public ResponseEntity<String> deleteFile(@PathVariable String fileName) {
        try {
            fileService.deleteFile(fileName);
            return ResponseEntity.ok("File deleted successfully!");
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Error deleting file: " + e.getMessage());
        }
    }

    // Método para modificar un archivo
    @PutMapping("/update/{fileName}")
    public ResponseEntity<String> updateFile(@PathVariable String fileName, @RequestParam("file") MultipartFile file) {
        try {
            fileService.updateFile(fileName, file);
            return ResponseEntity.ok("File updated successfully!");
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Error updating file: " + e.getMessage());
        }
    }

    // Método para listar los archivos disponibles
    @GetMapping("/list")
    public ResponseEntity<List<FileMetadata>> listFiles() {
        return ResponseEntity.ok(fileService.listFiles());
    }
}
