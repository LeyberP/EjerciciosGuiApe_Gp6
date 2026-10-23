# 📚 Ejercicios Guía APE – Grupo 6

| | |
|---|---|
| **Nombre:** | Leyber Peñafiel |
| **Curso:** | B |
| **Nivel:** | Primer semestre |
| **Docente:** | Ing. José Caiza |
| **Asignatura:** | Algoritmos y lógica de programación |
| **Institución:** | Universidad Técnica de Ambato – Carrera de Software |

---

## 📖 Descripción

Repositorio con los ejercicios de la **Guía APE (Clase 3)**, desarrollados en **Java**.

**Objetivo general:** resolver los ejercicios aplicando correctamente la declaración e invocación de métodos, el uso de parámetros, argumentos y valores de retorno.

**Objetivos específicos:**
- Distinguir cuándo un método debe usar `void` y cuándo debe devolver un valor.
- Aplicar parámetros y argumentos en la definición y llamada de métodos.
- Implementar métodos de cálculo y validación, e interpretar el paso por valor de tipos primitivos.

## 📑 Índice de ejercicios

| N.º | Ejercicio | Tema | Carpeta |
|---|---|---|---|
| Clase | Completar la clase Producto | `void` vs `return` | [EjercicioClase_Producto](./EjercicioClase_Producto) |
| 1 | Identificación de tipos de retorno | Corregir métodos sin `return` | [Ejercicio1_TiposRetorno](./Ejercicio1_TiposRetorno) |
| 2 | Método `void` | Acción directa (saludo) | [Ejercicio2_MetodoVoid](./Ejercicio2_MetodoVoid) |
| 3 | Parámetros vs. argumentos | Firma y llamada | [Ejercicio3_ParametrosArgumentos](./Ejercicio3_ParametrosArgumentos) |
| 4 | Paso por valor | Variables primitivas | [Ejercicio4_PasoPorValor](./Ejercicio4_PasoPorValor) |
| 5 | `calcularPromedio` | Media de tres `double` | [Ejercicio5_Promedio](./Ejercicio5_Promedio) |
| 6 | Validación de edad | Método `boolean` | [Ejercicio6_VerificarEdad](./Ejercicio6_VerificarEdad) |
| 7 | Clase Producto (inventario) | Atributos y método con retorno | [Ejercicio7_ProductoInventario](./Ejercicio7_ProductoInventario) |
| 8 | Instanciación e invocación | Uso del objeto en `main` | [Ejercicio8_Principal](./Ejercicio8_Principal) |

## 🗂️ Estructura del repositorio

```
EjerciciosGuiApe_Gp6/
├── README.md
├── EjercicioClase_Producto/
│   ├── README.md
│   └── Producto.java
├── Ejercicio1_TiposRetorno/
│   ├── README.md
│   └── Ejercicio1.java
├── Ejercicio2_MetodoVoid/
│   ├── README.md
│   └── Bienvenida.java
├── Ejercicio3_ParametrosArgumentos/
│   ├── README.md
│   └── Ejercicio3.java
├── Ejercicio4_PasoPorValor/
│   ├── README.md
│   └── Ejercicio4.java
├── Ejercicio5_Promedio/
│   ├── README.md
│   └── Ejercicio5.java
├── Ejercicio6_VerificarEdad/
│   ├── README.md
│   └── Ejercicio6.java
├── Ejercicio7_ProductoInventario/
│   ├── README.md
│   └── Producto.java
└── Ejercicio8_Principal/
    ├── README.md
    ├── Producto.java
    └── Principal.java
```

## ⚙️ Requisitos

- **JDK 17 o superior** ([descargar](https://adoptium.net/))
- Un editor o IDE (VS Code, IntelliJ IDEA, NetBeans)
- Git (opcional)

Comprueba tu instalación:
```bash
java -version
javac -version
```

## 📥 Cómo obtener el proyecto

```bash
git clone https://github.com/LeyberP/EjerciciosGuiApe_Gp6.git
cd EjerciciosGuiApe_Gp6
```

## ▶️ Cómo ejecutar cada programa

Regla general: entra a la carpeta del ejercicio, compila y ejecuta la clase que tenga el método `main`.

```bash
cd NombreCarpeta
javac *.java
java NombreClaseConMain
```

| Ejercicio | Comandos |
|---|---|
| [Clase: Producto](./EjercicioClase_Producto) | `cd EjercicioClase_Producto` → `javac *.java` → `java Producto`* |
| [1](./Ejercicio1_TiposRetorno) | `cd Ejercicio1_TiposRetorno` → `javac *.java` → `java Ejercicio1`* |
| [2](./Ejercicio2_MetodoVoid) | `cd Ejercicio2_MetodoVoid` → `javac *.java` → `java Bienvenida`* |
| [3](./Ejercicio3_ParametrosArgumentos) | `cd Ejercicio3_ParametrosArgumentos` → `javac *.java` → `java Ejercicio3`* |
| [4](./Ejercicio4_PasoPorValor) | `cd Ejercicio4_PasoPorValor` → `javac *.java` → `java Ejercicio4` |
| [5](./Ejercicio5_Promedio) | `cd Ejercicio5_Promedio` → `javac *.java` → `java Ejercicio5`* |
| [6](./Ejercicio6_VerificarEdad) | `cd Ejercicio6_VerificarEdad` → `javac *.java` → `java Ejercicio6`* |
| [7](./Ejercicio7_ProductoInventario) | `cd Ejercicio7_ProductoInventario` → `javac *.java` → `java Producto`* |
| [8](./Ejercicio8_Principal) | `cd Ejercicio8_Principal` → `javac *.java` → `java Principal` |

\* Estas clases solo definen métodos. Para ejecutarlas necesitan un `main` (propio o en una clase `Principal`). Si tu archivo no lo tiene, agrégalo para probar el método.

---

## 🧪 Descripción de los ejercicios

### Ejercicio de clase: clase `Producto` · [carpeta](./EjercicioClase_Producto)
- `mostrarDetalles()` solo imprime información, por eso es `void`.
- `calcularPrecioFinal(double porcentajeDescuento)` calcula y **devuelve** un `double` con `return`.

### Ejercicio 1: tipos de retorno · [carpeta](./Ejercicio1_TiposRetorno)
Regla: si un método declara un tipo distinto de `void`, debe devolver un valor compatible en todos los caminos. Si solo realiza una acción, debe ser `void`. Incluye un ejemplo de error (`double` sin `return`) y su corrección.

### Ejercicio 2: método `void` · [carpeta](./Ejercicio2_MetodoVoid)
`saludar(String nombre, int edad)` imprime un mensaje de bienvenida y no devuelve nada.

### Ejercicio 3: parámetros vs. argumentos · [carpeta](./Ejercicio3_ParametrosArgumentos)
Los **parámetros** (`nombre`, `edad`) se declaran en la firma del método. Los **argumentos** (`"Ana"`, `20`) se envían en la llamada.

### Ejercicio 4: paso por valor · [carpeta](./Ejercicio4_PasoPorValor)
En Java, un método recibe una **copia** de las variables primitivas. Cambiar el parámetro dentro del método no modifica la variable original del `main`.

### Ejercicio 5: `calcularPromedio` · [carpeta](./Ejercicio5_Promedio)
Recibe tres `double` y devuelve su media aritmética: `(n1 + n2 + n3) / 3.0`.

### Ejercicio 6: validación de edad · [carpeta](./Ejercicio6_VerificarEdad)
`verificarEdad(int edad)` devuelve `false` si la edad es menor que 0 o mayor que 120, y `true` en caso contrario.

### Ejercicio 7: clase `Producto` (inventario) · [carpeta](./Ejercicio7_ProductoInventario)
Atributos `stock` y `precioUnitario`; el método `calcularValorTotal()` devuelve `stock * precioUnitario`.

### Ejercicio 8: instanciación e invocación · [carpeta](./Ejercicio8_Principal)
En `Principal.main` se crea `Producto p`, se asignan `stock = 10` y `precioUnitario = 25.5`, y se imprime el total. **Salida esperada:** `255.0`

---

## ✅ Conclusiones

1. El tipo de retorno refleja el propósito del método: `void` para acciones y un tipo de dato para resultados reutilizables.
2. Los parámetros se declaran en la firma y los argumentos se pasan al invocar.
3. En tipos primitivos, Java pasa una copia del valor.
4. Combinar atributos y métodos con retorno permite obtener resultados reutilizables.

## 👨‍💻 Autor

**Leyber Peñafiel** · Primer semestre, Curso B · Docente: Ing. José Caiza
