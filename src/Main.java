

import java.io.File;
import java.util.Random;

import parser.AbogadoParser;
import parser.DentistaParser;
import parser.IngenieroParser;


public class Main {
    public static void main(String[] args) {
        final var listainputIngeniero = FileManager.leerFile(new File("src/ingenieros.csv"));
        final var listainputAbogado = FileManager.leerFile(new File("src/abogados.csv"));
        final var listainputDentista = FileManager.leerFile(new File("src/dentistas.csv"));

        final var listaIngenieros = IngenieroParser.generarListaIngeniero(listainputIngeniero);
        final var listaAbogados = AbogadoParser.generarListaAbogado(listainputAbogado);
        final var listaDentistas = DentistaParser.generarListaDentista(listainputDentista);

        final var random = new Random(); 

        final var randomIndexIngeniero = RandomUtilities.generarRandomInt(0,listaIngenieros.size() -1, random);
        final var randomIndexAbogado = RandomUtilities.generarRandomInt(0,listaAbogados.size() -1, random);
        final var randomIndexDentista = RandomUtilities.generarRandomInt(0,listaDentistas.size() -1, random);

        System.out.printf(" Random ingeniero: %s%n", listaIngenieros.get(randomIndexIngeniero));
        System.out.printf(" Random Abogado: %s%n", listaAbogados.get(randomIndexAbogado));
        System.out.printf(" Random Dentista: %s%n", listaDentistas.get(randomIndexDentista));

    }
}
