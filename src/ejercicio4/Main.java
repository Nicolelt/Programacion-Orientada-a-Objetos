package ejercicio4;

public class Main {
    public static void main(String[] args) {
        final var trabajador1 = new Trabajador("PAMELA", "GONZALEZ", 25);
        final var trabajador2 = new Trabajador("ANDRÉS", "TAPIA", 57, "CAMILA ECHEVERRIA");

        System.out.printf("nombre completo: %s %s, estado civil: %s%n", trabajador1.getNombre(), trabajador1.getApellido(), trabajador1.getEstadoCivil());
        System.out.printf("nombre completo: %s %s, estado civil: %s%n", trabajador2.getNombre(), trabajador2.getApellido(), trabajador2.getEstadoCivil());
    }
}
