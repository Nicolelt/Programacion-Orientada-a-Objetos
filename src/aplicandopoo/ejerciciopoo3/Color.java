package aplicandopoo.ejerciciopoo3;

public class Color {
    private final String nombre;
    private final String hexadecimal;
    

    public Color(String nombre, String hexadecimal) {
        this.nombre = nombre;
        this.hexadecimal = hexadecimal;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nombre;
    }

    
}
