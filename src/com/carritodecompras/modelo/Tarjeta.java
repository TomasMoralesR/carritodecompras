package com.carritodecompras.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompra;

    public Tarjeta(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompra = new ArrayList<>();
    }

    public boolean intentarCompra (Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.listaDeCompra.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompra() {
        return listaDeCompra;
    }

    //Método para calcular el total de la compra y mostrar el saldo restante
    public static double calcularTotalCompra (List<Compra> listaDeCompra) {
        double total = 0;
        for (Compra compra : listaDeCompra) {
            total += compra.getValor();
        }
        return total;
    }
}
