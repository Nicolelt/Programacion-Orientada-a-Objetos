package models;

public class persona {
    protected final String nombre; 
    protected final String apellido;
    protected final int edad;
    protected final boolean casado;
    public persona(String nombre, String apellido, int edad, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
    }

    
}
