package com.generation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "Raúl Ramírez Pérez";
        //Datos primitivos númericos
        byte num1 =10;
        short numshort = num1;
        int numInt = numshort;

        // short numShort2 = numInt; No lo permite por la cantidad de varaibles que ingresa


        short num2 =10;
        int num3 = 10;
        long num4 = 10;

        //Datos primitivos decimales
        float decimal =10.12f;
        double decimal2 = 20.2655656563645454545d;
        System.out.println("decimal2 = " + decimal2);

        //Datos primitivo
        char caracter = 'f';

        //Dato primitvo Boolean
        boolean verdaero = true;

        short numShort2 = (short) numInt;

        byte numByte1 = 120;
        byte numByte2 = 120;
        //short suma =  (short) (numByte1 +numByte2);
//        System.out.println(numInt);
//        System.out.println(numShort2);

        int suma = 5+10;
        System.out.println("suma = " + suma);
        int resta = 10-9;
        System.out.println("resta = " + resta);
        int mul = 10*10;
        System.out.println("multiplicacin = " + mul);
        float div = 15.2f/1.5f;
        System.out.println("divición = " + div);
        System.out.println(" Comparaión = " + (true||false&&true));
        boolean x =true, y = false,z = true;
        System.out.println(x||y||x&&!z&&!y);
        System.out.println(!x||!y||z&&x&&!y);

    }
}
