package com.open.bootcamp;

public class Main {

    public static void main(String[] args) {
        byte numeroByte = 1;
        short numeroShort = 2;
        int numeroInt = 3;
        long numeroLong = 4;
        float numeroFloat = 5.0f;
        double numeroDouble = 6.01d;
        char character = 'a';
        boolean valorBoolean = true;
        String cadena = "Nombre";
        Integer envoltorioInteger = 10;
        Double envoltorioDouble = 10.5D;
        Long envoltorioLong = 10L;

        System.out.println("Este es un byte: " + numeroByte);
        System.out.println("Este es un short: " + numeroShort);
        System.out.println("Este es un integer primitivo: " + numeroInt);
        System.out.println("Este es un long primitivo: " + numeroLong);
        System.out.println("Este es un punto flotante: " + numeroFloat);
        System.out.println("Este es un double primitivo: " + numeroDouble);
        System.out.println("Este es un char: " + character);
        System.out.println("Este es un valor booleano: " + valorBoolean);
        System.out.println("Este es una cadena de caracteres: " + cadena);
        System.out.println("Este es un envoltorio Integer: " + envoltorioInteger.toString());
        System.out.println("Este es un envoltorio Double: " + envoltorioDouble.toString());
        System.out.println("Este es un envoltorio Long: " + envoltorioLong.toString());
    }
}
