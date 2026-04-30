package models;

public abstract class persona {
    protected final String nombre; 
    protected final String apellido;
    protected final int edad;
    protected final boolean casado;
    protected double porcentajeExito;
    
    public persona(String nombre, String apellido, int edad, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
    }

    public abstract void calcularPorcentajeExito(); //método abstracto

    
}
