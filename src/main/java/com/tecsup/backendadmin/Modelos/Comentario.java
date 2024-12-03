package com.tecsup.backendadmin.Modelos;

import java.time.LocalDateTime;

public class Comentario {
    private Long id;
    private String contenido;
    private LocalDateTime fechaComentario;
    private Long usuarioId;
    private Long proyectoId;

    // Constructor, getters y setters

    public Comentario() {}

    public Comentario(Long id, String contenido, LocalDateTime fechaComentario, Long usuarioId, Long proyectoId) {
        this.id = id;
        this.contenido = contenido;
        this.fechaComentario = fechaComentario;
        this.usuarioId = usuarioId;
        this.proyectoId = proyectoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(LocalDateTime fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(Long proyectoId) {
        this.proyectoId = proyectoId;
    }
}
