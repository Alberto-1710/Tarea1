package hn.unah.lenguajes1900.tarea1.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.tarea1.dto.CrearAlumno;
import hn.unah.lenguajes1900.tarea1.dto.CrearClase;

@RestController
@RequestMapping("/home")
public class HomeController {

    private List<CrearAlumno> lAlumnos = new ArrayList<>();
    private List<CrearClase> lClases = new ArrayList<>();

    
    @GetMapping("/Alumno/crear")
    public String CrearAlumno(@RequestBody CrearAlumno alumnoDto){
        lAlumnos.add(alumnoDto);
        return "Alumno creado exitosamente";
        }

    @GetMapping("/Clase/crear")
    public String CrearAlumnos(@RequestBody CrearClase nvoclaseDto){
        lClases.add(nvoclaseDto);
        return "Asignatura Creada Exitosamente";
    }
        @GetMapping("/AgregarClases/{numCuenta}/{codClase}")
        public String AgregarClases(@PathVariable String numeroCuenta,
            @PathVariable String codClase){
            String mensaje = "";
            // boolean encontrado = false;
            if (lAlumnos.isEmpty()) {
                mensaje = "No existe ningun Alumno Registrado";
            }
            else if(lAlumnos.isEmpty()) {
                mensaje = "No existe ninguna Materia Registrada";
            }else{
                
            }}
                for (CrearAlumno CrearAlumno : lAlumnos){
                    if (CrearAlumno.getNumeroCuenta().equals(numeroCuenta)){
                        for (CrearClase CrearClase : lClases){
                            if ( clase.getCodigo().equals(codClase)) {
                                    alumno.AgregarClases(clase);
                                    mensaje = "Asignatura Registrada exitosamente";
                                    break;
                            }
                            else{
                                    mensaje = "Asignatura no enco 2ntrada";
                            }
                        }
                        break;
                    }
                    else{
                        mensaje = "Estudiante no encontrado";
                    }
                }
    
    
    
            return mensaje;
        }

        @GetMapping("/VerAlumnos")
        public String MostrarAlumnos(){
            return "\n " +lAlumnos;
        }
    
        @GetMapping("/VerClases")
        public String MostrarClases(){
            return "\n " +lClases;
        }
    
    