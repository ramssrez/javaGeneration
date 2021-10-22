package com.company;

import com.company.animales.Ave;
import com.company.animales.Perro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        	/*
	herencia: heredar atributos de una clase padre
    polimorfismo: variaciones en el funcionamiento de un mismo método en clases diferentes
    */
        Ave ave = new Ave("perri el ornitorrinco");
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();

//        Ya no se puede realizar la instancia del objeto animal por ser clase abstracta
//        Animal animal = new Animal();
//        animal.comunicarse();
//
        // animal.hacerNido(); // no se puede, ya que solo se hereda en un solo sentido, de padre a hijo
        System.out.println("-----------------------------------------------");

        Perro lomito = new Perro("Giby");
        lomito.comunicarse();
        lomito.jugar();
        lomito.comer();
        //igualmente no puede acceder a nada de la clase ave porque igualmente solo va de padre a hijo

    }
}
