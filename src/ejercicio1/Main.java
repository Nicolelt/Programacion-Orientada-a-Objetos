package ejercicio1;

public class Main {
    public static void main(String[] args) {
        final var Producto1 = new Producto("Lechuga", 1000, 20, 1.000, true, 1.250);
        final var Producto2 = new Producto("Limón", 800, 500, 1.000, true, 5.550);

        System.out.printf("Nombre: %s, precio: %.2f, stock: %d%n", Producto1.getNombre(), Producto1.getPrecio(), Producto1.getStock());
        System.out.printf("Nombre: %s, precio: %.2f, stock: %d%n", Producto2.getNombre(), Producto2.getPrecio(), Producto2.getStock());
    }
}
