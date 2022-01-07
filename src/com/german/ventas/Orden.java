package com.german.ventas;

public class Orden {

    private int idOrden;
    /*declaramos el arreglo peor no se ha inicializado aun*/
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        /*inicializamos el contador asignandole in ID a cada ORden*/
        this.idOrden = ++Orden.contadorOrdenes;
        /*Inicializamp e instanciamos el arreglo de tipo productos indicando la
        * cantidad maxima de elementos con la ayuda de la constante MAX_PRODUCTOS*/
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos<Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el Maximo del Producto");
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
           // Producto producto = this.productos[i];
           // total += producto.getPrecio(); //total = total + producto.getPrecio()
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total del la Orden: $" + totalOrden);
        System.out.println("Products de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            /*se itera y se muestran los productos de la variable i */
            System.out.println(this.productos[i]);
        }
    }
}
