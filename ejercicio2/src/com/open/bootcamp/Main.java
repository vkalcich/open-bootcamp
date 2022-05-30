package com.open.bootcamp;

public class Main {

    public static final Double IVA = 1.21;

    public static void main(String[] args) {
        Main main = new Main();
        Double precioFinal = main.retornarPrecioConIVA(100.00);
        System.out.println(precioFinal);
    }

    private Double retornarPrecioConIVA(Double precio) {
        return precio * IVA;
    }
}
