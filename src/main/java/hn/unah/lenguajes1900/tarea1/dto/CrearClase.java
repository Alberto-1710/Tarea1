package hn.unah.lenguajes1900.tarea1.dto;

public class CrearClase {
    private String codigo;
    private String descripcion;
    private Integer uv;
   
    public String toString(){
        return "codigo: " + this.codigo + 
            " Descripcion: " + this.descripcion + 
            " Unidades Valorativas: " + this.uv + "\n";
}
}
