package com.company;

import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner( System.in);
    static int num1;
    static int num2;

    public static void main(String[] args) {
	// write your code here
        todosMetodos();
    }
    public static void todosMetodos(){
        ingresoValores();
        suma(num1, num2);
        resta(num1, num2);
        multi(num1, num2);
        div(num1, num2);
        console.close();
    }

    public static void ingresoValores(){
        System.out.println("Ingresa los siguientes valores");
        System.out.print("Ingresa el número 1:  ");
        num1 = console.nextInt();
        System.out.print("Ingresa el número 2:  ");
        num2 = console.nextInt();
    }
    public static void suma(int num1, int num2){
        System.out.println("------------------------------------------------------------");
        System.out.println("La suma de " + num1 + " " + num2 + " es: " + (num1 + num2));

    }
    public  static void  resta(int num1,  int num2){
        System.out.println("------------------------------------------------------------");
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
    }
    public  static void  multi(int num1,  int num2){
        System.out.println("------------------------------------------------------------");
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
    }
    public  static void  div(int num1,  int num2){
        Double numeroUno = Double.valueOf(num1);
        Double numeroDos = Double.valueOf(num2);
        System.out.println("------------------------------------------------------------");
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + (numeroUno / numeroDos));
        System.out.println("------------------------------------------------------------");
    }
}
