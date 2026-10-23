public class Principal {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.stock = 10;
        p.precioUnitario = 25.5;

        double totalInventario = p.calcularValorTotal();
        System.out.println(totalInventario); // 255.0
    }
}
