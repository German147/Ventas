package com.german.ventas;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa",55.62);
        Producto producto2 = new Producto("pantalon",114.52);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

    }
}
