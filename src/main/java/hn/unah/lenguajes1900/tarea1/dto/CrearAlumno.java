package hn.unah.lenguajes1900.tarea1.dto;


import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearAlumno {
    
    protected String numeroCuenta;
    private String nombre;
    private String apellido;
    private String correo;
    //private String[] listaClases;
    private List<String> listaAlumnos = new ArrayList<>();

    public String crear(String numeroCuenta, String nombre, String apellido, String correo){
        CrearAlumno nvoAlumno = new CrearAlumno();
        //listaAlumnos.add(nvoAlumno);
        return "Alumno creado exitosamente";
    }

   
    public String toString(){
        return "Cuenta: " + this.numeroCuenta + "\n" + "Nombre: " + this.nombre + "\n"
        + "Apellido: " + this.apellido + "\n" + "Correo: " + this.correo /* + "\n" + "Clases: " +  this.listaClases*/ ; 
    }
}
