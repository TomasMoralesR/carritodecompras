# 🛒 Aplicación de Compras en Consola - Java

Una aplicación de consola desarrollada en Java para simular compras con una tarjeta de saldo limitado. El usuario ingresa el saldo inicial, realiza compras introduciendo la descripción y el valor de los artículos, y la aplicación se encarga de validar el saldo, registrar las compras y mostrar un resumen final ordenado por precio.

---

## 📚 Conceptos aplicados

- Programación orientada a objetos (POO)
- Uso de clases, atributos, métodos y encapsulamiento
- ArrayList para almacenar objetos
- Estructuras de control (condicionales y ciclos)
- Entrada de datos con `Scanner`
- Uso de `Collections.sort()` y `Comparator` para ordenar objetos

---

## 🧩 Estructura del proyecto
src/

├── Compra.java // Representa una compra individual

├── Tarjeta.java // Representa la tarjeta con saldo y lista de compras

└── Main.java // Lógica principal, interacción con el usuario


---

## 🧪 Cómo usar la aplicación

1. Clona o descarga el repositorio.
2. Abre el proyecto en tu IDE de Java favorito (IntelliJ, Eclipse, VSCode).
3. Ejecuta la clase `Main`.
4. Ingresa el saldo inicial de la tarjeta.
5. Comienza a ingresar artículos con su descripción y valor.
6. Cuando ya no tengas saldo o decidas dejar de comprar, se mostrará un resumen ordenado.

---

## 💡 Ejemplo de uso

```text
¡Bienvenido! Ingrese el valor inicial de la tarjeta:
> 10000

Ingrese la descripción del artículo:
> Zapatos

Ingrese el valor del artículo:
> 6500

Artículo agregado, saldo restante: $3500
¿Desea seguir comprando? (si/no)
> si

...

**********************************************
Compra completada, este es tu resumen:
- Camiseta: $2500
- Zapatos: $6500
🧾 Total de la compra: $9000
💳 Saldo restante: $1000
**********************************************
```
## Autor
Tomás Morales 