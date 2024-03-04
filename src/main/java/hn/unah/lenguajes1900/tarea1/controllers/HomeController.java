package hn.unah.lenguajes1900.tarea1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.tarea1.dto.CrearAlumno;
import hn.unah.lenguajes1900.tarea1.dto.CrearClase;

@RestController
@RequestMapping("/home")
public class HomeController {
    
    @GetMapping("/Alumno/crear")
    public String CrearAlumno(@RequestBody CrearAlumno alumnoDto){
            return "Alumno creado exitosamente";
        }

    @GetMapping("/Clase/crear")
    public String CrearAlumno(@RequestBody CrearClase CrearClaseDto){
            return CrearClaseDto.toString();
         }

    @GetMapping("/Alumno/ver")
    public String verAlumno(CrearAlumno alumnoDto){
        return alumnoDto.toString();
    }
        /*if (id != null) {
            return alumnoDto.toString();
        } else {
            // Manejar el caso en el que el id no sea válido
            return "El numero de cuenta ingresado no fue encontrado";
        }*/
    }

