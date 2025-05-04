package com.carritodecompras.principal;

import com.carritodecompras.modelo.Compra;
import com.carritodecompras.modelo.Tarjeta;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner para ingresar datos por consola
        Scanner scanner = new Scanner(System.in);

        //Aquí el usuario puede ingresar el valor inicial de la tarjeta
        System.out.println("¡Bienvenido! Ingrese el valor inicial de la tarjeta");
        double limite = scanner.nextDouble();
        Tarjeta tarjeta = new Tarjeta(limite);
        scanner.nextLine();

        //Ciclo de compras usando while
        boolean seguirComprando = true;
        while (seguirComprando && (tarjeta.getSaldo() > 0)) {
            System.out.println("¿Que artículo deseas comprar?");
            String descripcion = scanner.nextLine();

            System.out.println("Ingrese el valor del artículo");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            Compra compra = new Compra(descripcion, valor);
            boolean articuloAgregado = tarjeta.intentarCompra(compra);

            if (articuloAgregado) {
                System.out.println("Artículo agregado, saldo restante: $" + tarjeta.getSaldo());

                //Validar si queda saldo para seguir comprando
                if (tarjeta.getSaldo() <= 0) {
                    System.out.println("Ya no tienes saldo");
                    seguirComprando = false;
                } else {
                    System.out.println("¿Desea seguir comprando? (si/no)");
                    String respuesta = scanner.nextLine();

                    if (respuesta.equalsIgnoreCase("no")) {
                        seguirComprando = false;
                    } // Si el usuario dice "sí", seguimos, no hay que poner más
                }
            } else {
                System.out.println("No tienes saldo suficiente para esta compra.");
                seguirComprando = false;
            }
        }

        //Resumen de la comora
        System.out.println("**********************************************");
        System.out.println("Compra completada, este es tu resumen: ");

        //Ordenar la compra de menor a mayor valor con .sort()
        Collections.sort(tarjeta.getListaDeCompra());
        for (Compra compra : tarjeta.getListaDeCompra()) {
            System.out.println(compra.getDescripcion() + " $" + compra.getValor());
        }

        //Total de la compra
        System.out.println("**********************************************");
        System.out.println("Total: $" + Tarjeta.calcularTotalCompra(tarjeta.getListaDeCompra()));
    }
}
