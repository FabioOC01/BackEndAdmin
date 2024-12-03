package com.tecsup.backendadmin.Service;

import com.tecsup.backendadmin.Modelos.CategoriaProyecto;
import com.tecsup.backendadmin.Modelos.Alumno;
import com.tecsup.backendadmin.Modelos.Comentario;
import com.tecsup.backendadmin.Modelos.Proyecto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class APIService {

    private final String API_URL = "https://api-proyecto-integrador.onrender.com/api/";

    public Proyecto getProyectoById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + "proyectos/" + id, Proyecto.class);
    }

    public List<Proyecto> getAllProyectos() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + "proyectos/", List.class);
    }

    public CategoriaProyecto getCategoriaById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + "categorias/" + id, CategoriaProyecto.class);
    }

    public Alumno getAlumnoById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + "alumnos/" + id, Alumno.class);
    }

    public List<Comentario> getComentariosByProyectoId(Long proyectoId) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + "comentarios/?proyecto=" + proyectoId, List.class);
    }
}
