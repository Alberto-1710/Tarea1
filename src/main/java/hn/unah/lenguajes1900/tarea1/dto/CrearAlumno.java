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
    private List<CrearClase> lClases = new ArrayList<>();
    //private String[] listaClases;
   

   
    public String toString(){
        return "Cuenta: " + this.numeroCuenta + "\n" + "Nombre: " + this.nombre + "\n"
        + "Apellido: " + this.apellido + "\n" + "Correo: " + this.correo /* + "\n" + "Clases: " +  this.listaClases*/ ; 
    }

    public void AgregarClases(CrearClase clase){
        lClases.add(clase);
    }
}

