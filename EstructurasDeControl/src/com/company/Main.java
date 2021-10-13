package com.company;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Estructurade control if
        /*
        if (condicion){

        }elseif(){

        }
        */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingresa tu edad: ");
//        int  edad = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("¿Cuál es tu nombre?");
//        String nombre = scanner.nextLine();
//
//        if(edad>18){
//            System.out.println("Felicidades " + nombre + " puedes votar");
//        }else{
//            System.out.println("Hola " + nombre +  ". Aún no puedes votar");
//        }

        /* Solicitar al usuario 3 angulos de un triangulo y determinar si el triangulo
                * es válido*/
//        System.out.println("Solicitar al usuario 3 angulos de un triangulo y determinar si el triangulo es valido");
//        int suma,angulo1, angulo2, angulo3;
//        System.out.println("ingresa el primer angulo");
//        angulo1 = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("ingresa el segundo angulo");
//        angulo2 = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("ingresa el tercer angulo");
//        angulo3 = scanner.nextInt();
//        scanner.nextLine();
//        suma = angulo1 + angulo2 + angulo3;
//        if(suma == 180){
//            System.out.println("Los angulos son correctos, se puede realizar un triangulo");
//        }else{
//            System.out.println("Los angulos no son correctos, la suma tiene que dar 180°");
//        }

        //Pedir un año al usuario por consola, y determinar si el
        //            año es bisiesto.

//        GregorianCalendar calendario = new GregorianCalendar();
//        System.out.print("Ingresa un año: ");
//        int year = scanner.nextInt();
//        scanner.nextLine();
//        if(calendario.isLeapYear(year)){
//            System.out.println("El año es bisiesto");
//        }else{
//            System.out.println("El año no es bisiesto");
//        }
//
//        //Otra opcion
//        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
//            System.out.println("El año es bisiesto");
//        }else{
//            System.out.println("El año no es bisiesto");
//
//        }

//        System.out.print("Ingresa un número: ");
//        int numeroUno = scanner.nextInt();
//        System.out.print("Ingresa otro número: ");
//        int numeroDos = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Ingresa la operación deseada: \n1)Suma \n2)Resta \n3)Multiplicación \n4)División");
//        int operacion = scanner.nextInt();
//        float resultado = 0;
//
//        switch (operacion){
//            case 1:
//                System.out.println("La suma es: " + (numeroUno+numeroDos));
//                break;
//            case 2:
//                System.out.println("La resta es: " + (numeroUno-numeroDos));
//                break;
//            case 3:
//                System.out.println("La multiplicaion es: " + (numeroUno*numeroDos));
//                break;
//            case 4:
//                resultado = (numeroUno/numeroDos);
//                System.out.println("La división es: " + resultado);
//                break;
//            default:
//                System.out.println("No se puede realizar las operaciones");
//                break;
//        }

        // Pedir un número al usuario y dependiendo la respuesta
        // mostrar un dia de la semana, ejemplo: 1) Domingo, 2) Lunes ... 7)Sabado
        // Si elige un numero fuera de ese rango mostar un mensaje de error;
       // System.out.println("Ingresa un número de la semana: \n1)Lunes \n2)Martes \n3)Miercoles \n4)Jueves \n5)Viernes \n6)Sabado \n7)Domingo");
//        int valor = scanner.nextInt();
//        switch (valor){
//            case 1:
//                System.out.println("El dia de hoy es Lunes");
//                break;
//            case 2:
//                System.out.println("El dia de hoy es Martes");
//                break;
//            case 3:
//                System.out.println("El dia de hoy es Miercoles");
//                break;
//            case 4:
//                System.out.println("El dia de hoy es Jueves");
//                break;
//            case 5:
//                System.out.println("El dia de hoy es Viernes");
//                break;
//            case 6:
//                System.out.println("El dia de hoy es Sabado");
//                break;
//            case 7:
//                System.out.println("El dia de hoy es Domingo");
//                break;
//            default:
//                System.out.println("Este número no es parte de los dias de la semana");
//                break;
//        }

        //        int numero,fibo1,fibo2,i;
//
//        do{
//            System.out.print("Introduce numero mayor que 1: ");
//            numero = scanner.nextInt();
//        }while(numero<=1);
//
//        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");
//
//        fibo1=0;
//        fibo2=1;
//
//        System.out.print(fibo1 + " ");
//        for(i=2;i<=numero;i++){
//            System.out.print(fibo2 + " ");
//            fibo2 = fibo1 + fibo2;
//            fibo1 = fibo2 - fibo1;
//        }
//        System.out.println();
//        System.out.println("Adivina el número secreto. Ingresa un número");
//        int numero = scanner.nextInt();
//        int numeroSecreto =35;
//        while (numero != numeroSecreto){
//            System.out.println("Adivin el número secreto. Ingresa un número");
//            numero = scanner.nextInt();
//        }
//        //scanner.close();
//        System.out.println("Felicidades adivinaste el número secreto");
//
//        do {
//            System.out.println("Adivin el número secreto. Ingresa un número");
//            numero = scanner.nextInt();
//        }while (numero != numeroSecreto);
    }
}
