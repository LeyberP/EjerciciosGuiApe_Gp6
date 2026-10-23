// Incorrecto: declara double, pero no devuelve un valor
public double calcularArea(double lado) {
    System.out.println(lado * lado);
}

// Corrección: devuelve el resultado calculado
public double calcularArea(double lado) {
    return lado * lado;
}
