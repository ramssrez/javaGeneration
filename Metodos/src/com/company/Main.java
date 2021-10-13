package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String mensaje = saludar("Raúl Ramírez");
        System.out.println(mensaje);
        System.out.println("La suma es: " + suma(5,8));
        alerta("Esto es un mensaje de prueba");
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
