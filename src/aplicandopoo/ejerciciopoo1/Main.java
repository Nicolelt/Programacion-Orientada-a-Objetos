package aplicandopoo.ejerciciopoo1;


public class Main {
    public static void main(String[] args) {
        final var Producto1 = new Producto("Lechuga", 1000, 20, 1.000, true, 1.250);
        final var Producto2 = new Producto("Limón", 800, 500, 1.000, true, 5.550);

        System.out.printf("Producto1: %s%n", Producto1);
        System.out.printf("Producto2: %s%n", Producto2);
        
    }
}
