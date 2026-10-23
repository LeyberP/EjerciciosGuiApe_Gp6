# 💻 Ejercicios Guía APE - Algoritmos y Lógica de Programación

**Universidad Técnica de Ambato**  
*Facultad de Ingeniería en Sistemas, Electrónica e Industrial - Carrera de Software*

---

## 📋 Datos Informativos

| Campo | Detalle |
| :--- | :--- |
| **Nombre:** | Leyber Peñafiel |
| **Nivel:** | Primer Semestre |
| **Curso / Paralelo:** | B (1-B) |
| **Asignatura:** | Algoritmos y Lógica de Programación |
| **Docente:** | Ing. José Caiza (Ing. Jose Caizabuano, Mg.) |
| **Repositorio:** | [EjerciciosGuiApe_Gp6](https://github.com/LeyberP/EjerciciosGuiApe_Gp6/tree/main) |

---

## 🎯 Objetivos de la Práctica

* **Objetivo General:** Resolver los ejercicios de la clase aplicando correctamente la declaración e invocación de métodos en Java, así como el uso de parámetros, argumentos y valores de retorno.
* **Objetivos Específicos:**
  * Distinguir cuándo un método debe usar `void` y cuándo debe devolver un valor.
  * Aplicar parámetros y argumentos en la definición y llamada de métodos.
  * Implementar métodos de cálculo y validación, e interpretar el paso por valor de tipos primitivos.

---

## 📂 Estructura del Repositorio y Descripción de Ejercicios

> 💡 **Nota:** Haz clic en los enlaces de cada carpeta o archivo para ir directamente al código fuente dentro del repositorio. *(Si tus carpetas tienen nombres ligeramente distintos en GitHub, solo ajusta la ruta entre paréntesis).*

### 🔹 [Ejercicio en Clase: Completar la clase `Producto`](./EjercicioEnClase/)
* **Archivo principal:** [`Producto.java`](./EjercicioEnClase/Producto.java)
* **Descripción:** Implementación de la clase `Producto` con los atributos `nombre` y `precio`. Incluye el método `mostrarDetalles()` (tipo `void` para imprimir en consola) y el método `calcularPrecioFinal(double porcentajeDescuento)` que retorna un `double` con el precio tras aplicar el descuento.

### 🔹 [Ejercicio 1: Identificación de tipos de retorno](./Ejercicio1/)
* **Archivo principal:** [`Area.java`](./Ejercicio1/Area.java)
* **Descripción:** Corrección de errores comunes en métodos con retorno. Demuestra que si un método declara un tipo de retorno como `double` (ej. `calcularArea(double lado)`), debe incluir obligatoriamente una instrucción `return` que devuelva el resultado compatible (`lado * lado`), en lugar de solo imprimirlo.

### 🔹 [Ejercicio 2: Método `void` para una acción directa](./Ejercicio2/)
* **Archivo principal:** [`Bienvenida.java`](./Ejercicio2/Bienvenida.java)
* **Descripción:** Creación de la clase `Bienvenida` con el método `saludar(String nombre, int edad)`. Al tratarse únicamente de mostrar un mensaje de bienvenida por pantalla sin requerir el dato para cálculos posteriores, se emplea el tipo de retorno `void`.

### 🔹 [Ejercicio 3: Parámetros vs. Argumentos](./Ejercicio3/)
* **Archivo principal:** [`ParametrosArgumentos.java`](./Ejercicio3/ParametrosArgumentos.java)
* **Descripción:** Demostración práctica de la diferencia entre **parámetros** (variables `nombre` y `edad` declaradas en la firma del método `saludar`) y **argumentos** (los valores reales como `"Ana"` y `20` que se envían al invocar el método).

### 🔹 [Ejercicio 4: Comportamiento del paso por valor](./Ejercicio4/)
* **Archivo principal:** [`PasoPorValor.java`](./Ejercicio4/PasoPorValor.java)
* **Descripción:** Evaluación del paso por valor en tipos de datos primitivos en Java. Se demuestra mediante el método `cambiar(int valor)` que reasignar un valor dentro del método (`valor = 50`) afecta únicamente a la copia local y no modifica la variable original (`numero = 10`) definida en el método `main`.

### 🔹 [Ejercicio 5: Método `calcularPromedio`](./Ejercicio5/)
* **Archivo principal:** [`Promedio.java`](./Ejercicio5/Promedio.java)
* **Descripción:** Implementación del método `calcularPromedio(double n1, double n2, double n3)`, el cual recibe tres calificaciones o valores numéricos de tipo `double`, calcula su media aritmética y retorna el resultado exacto.

### 🔹 [Ejercicio 6: Validación de edad](./Ejercicio6/)
* **Archivo principal:** [`ValidacionEdad.java`](./Ejercicio6/ValidacionEdad.java)
* **Descripción:** Creación del método `verificarEdad(int edad)` con retorno booleano (`boolean`). Evalúa si la edad ingresada se encuentra fuera del rango válido (`edad < 0 || edad > 120`), mostrando un mensaje de alerta y retornando `false` si es inválida, o `true` en caso contrario.

### 🔹 [Ejercicio 7: Completar la clase `Producto` (Inventario)](./Ejercicio7/)
* **Archivo principal:** [`Producto.java`](./Ejercicio7/Producto.java)
* **Descripción:** Definición de la clase `Producto` enfocada en control de inventario, utilizando los atributos `stock` (`int`) y `precioUnitario` (`double`), junto con el método `calcularValorTotal()` que retorna el producto de ambos atributos.

### 🔹 [Ejercicio 8: Instanciación e invocación en `main`](./Ejercicio8/)
* **Archivos principales:** [`Principal.java`](./Ejercicio8/Principal.java) | [`Producto.java`](./Ejercicio8/Producto.java)
* **Descripción:** Clase ejecutable `Principal` que instancia un objeto `p` de tipo `Producto`, le asigna un `stock` de `10` y un `precioUnitario` de `25.5`, invoca el método `calcularValorTotal()` y muestra en consola el total del inventario (`255.0`).

---

## 🚀 Cómo Ejecutar los Programas

Para clonar este repositorio y ejecutar cualquiera de los ejercicios en tu máquina local, sigue estos pasos:

### 1. Prerrequisitos
* Tener instalado **Java Development Kit (JDK)** (versión 8 o superior). Puedes verificarlo ejecutando `java -version` en tu terminal.
* Contar con **Git** instalado (opcional, también puedes descargar el proyecto como archivo `.zip`).

### 2. Clonar el repositorio
Abre tu terminal o consola de comandos y ejecuta:
```bash
git clone [https://github.com/LeyberP/EjerciciosGuiApe_Gp6.git](https://github.com/LeyberP/EjerciciosGuiApe_Gp6.git)
cd EjerciciosGuiApe_Gp6
