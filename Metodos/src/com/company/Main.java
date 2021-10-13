package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String mensaje = saludar("Raúl Ramírez");
        System.out.println(mensaje);
        System.out.println("La suma es: " + suma(5,8));
        alerta("Esto es un mensaje de prueba");
        /*
        Utilizacion de la clase math

         */
        double operador1=25.5;
        double operador2=15.21;
        System.out.println(Math.ceil(operador1)); 
        System.out.println(Math.floor(operador2));
        System.out.println(Math.pow(operador1, operador2));
        System.out.println(Math.max(operador1, operador2));
        System.out.println(Math.sqrt(operador1));

    }
    public static String saludar( String nombre){
        return "Hola, como estas " + nombre;
    }

    public static  int suma(int numeroUno, int numeroDos){
        return numeroUno + numeroDos;
    }
    public static void alerta(String mensaje){
        System.out.println(mensaje);
    }
}
