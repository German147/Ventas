package com.german.ventas;

public class Producto {
/*el valor "final" indica que una vez asignado el valor a una variable ya no puede ser cambiado*/
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    /*En este constructor, lo que se establce es que por cada producto que se cree
    * se le asigne un id diferente (un nuevo identidicador)*/
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        /*En este This() con el constructor vacio hace la llmada para asignar el id nuevo
        * a cada producto que se genere--Va en primer lugar para que tome al primer constructor*/
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
