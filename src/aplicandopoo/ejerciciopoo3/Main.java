package aplicandopoo.ejerciciopoo3;

public class Main {
    public static void main(String[] args) {
        final var colorRojo = new Color("ROJO", "#E74C3C");
        final var colorAzul = new Color("AZUL", "#3498DB");
        final var colorAmarillo = new Color("AMARILLO","HF7DC6F");

        final var persona1 = new Persona("OMAR","VARGAS", 44, 95.123, true, colorAzul, Persona.Profesion.INGENIERO);

        System.out.printf("persona1: %s%n", persona1);
    }
}
