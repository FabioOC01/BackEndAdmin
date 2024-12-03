package com.tecsup.backendadmin.Modelos;

public class Alumno {
    private Long id;
    private String nombre;
    private String apellido;
    private Long grupoId;
    private Long seccionId;
    private Long añoId;

    // Constructor, getters y setters

    public Alumno() {}

    public Alumno(Long id, String nombre, String apellido, Long grupoId, Long seccionId, Long añoId) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grupoId = grupoId;
        this.seccionId = seccionId;
        this.añoId = añoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(Long grupoId) {
        this.grupoId = grupoId;
    }

    public Long getSeccionId() {
        return seccionId;
    }

    public void setSeccionId(Long seccionId) {
        this.seccionId = seccionId;
    }

    public Long getAñoId() {
        return añoId;
    }

    public void setAñoId(Long añoId) {
        this.añoId = añoId;
    }
}
