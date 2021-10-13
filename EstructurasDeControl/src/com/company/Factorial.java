package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numero = scanner.nextInt();
        int factorial = 1;
        while (numero!=0){
            factorial = factorial * numero;
            //System.out.println("factorial = " + factorial);
            numero--;
            //System.out.println(" numero= " +numero);
        }
        System.out.println("factorial = " + factorial);
    }
}
