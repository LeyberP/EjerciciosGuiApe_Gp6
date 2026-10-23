public class Producto {
    String nombre;
    double precio;

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }

    public double calcularPrecioFinal(double porcentajeDescuento) {
        double descuento = precio * (porcentajeDescuento / 100);
        return precio - descuento;
    }
}
