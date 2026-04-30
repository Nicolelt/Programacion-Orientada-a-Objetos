package models;

public class Dentista extends persona {
    private final String centroDental;
    private final int pacientesFelices;
    private final int pacientesTotales;
    public Dentista(String nombre, String apellido, int edad, boolean casado, String centroDental, int pacientesFelices,
            int pacientesTotales) {
        super(nombre, apellido, edad, casado);
        this.centroDental = centroDental;
        this.pacientesFelices = pacientesFelices;
        this.pacientesTotales = pacientesTotales;
        calcularPorcentajeExito();
    }
    @Override
    public String toString() {
        final var multilinea = """
                {
                    nombre: %s
                    apellido: %s
                    edad: %d
                    casado: %b
                    centro dental: %s
                    pacientes felices: %d
                    pacientes totales: %d
                    porcentaje de exito: %.2f
                }
                """;
        return String.format(
            multilinea,
            nombre,
            apellido,
            edad,
            casado,
            centroDental,
            pacientesFelices,
            pacientesTotales,
            porcentajeExito
        );
    }
    @Override
    public void calcularPorcentajeExito(){
        porcentajeExito = ((double) pacientesFelices / pacientesTotales) * 100.0;
    }

    
}
