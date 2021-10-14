package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String universidades [];
//        universidades = new String[5];
//        universidades[0]= "ITVH";
//        universidades[1]= "ULA";
//        universidades[2]= "UAM";
//        universidades[3]= "UADM";
//        universidades[4]= "UNAM";
////        universidades[5]= "IPN";
////        universidades[6]= "TESCO";
////        universidades[7]= "UnADM";
//        for (String universidad : universidades){
//            System.out.println(universidad);
//        }

        /*
        Uso de colecciones
         */
        System.out.println("Uso de HashSet");
        Set<String> frutas = new HashSet<>();
        //Caracteristicas principales de set
        /*
          *No puede contener elementos duplicados
         */
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");
        frutas.add("Mango");

        for (String fruta : frutas){
            System.out.println(fruta);
        }

        /*
        Uso de TreeSet
        Es mas lento que el hashset
        Ordena los elementos
         */
        System.out.println("--------------------------------");
        System.out.println("Uso de TreeSet");
        Set<String> frutasDos = new TreeSet<>();
        frutasDos.add("Mango");
        frutasDos.add("Fresa");
        frutasDos.add("Pera");
        frutasDos.add("Uva");
        frutasDos.add("Melon");
        frutasDos.add("Lima");
        frutasDos.add("Mango");

        for (String fruta : frutasDos){
            System.out.println(fruta);
        }
                /*
        Uso de LinkedHashSet
        Mas costosa que hasSet
        Almacena los valores en orden de inserción
         */
        System.out.println("--------------------------------");
        System.out.println("Uso de LinkedHashSet");
        Set<String> frutasTres = new LinkedHashSet<>();
        frutasTres.add("Mango");
        frutasTres.add("Fresa");
        frutasTres.add("Pera");
        frutasTres.add("Uva");
        frutasTres.add("Melon");
        frutasTres.add("Lima");
        frutasTres.add("Mango");

        for (String fruta : frutasTres){
            System.out.println(fruta);
        }
    }
}
