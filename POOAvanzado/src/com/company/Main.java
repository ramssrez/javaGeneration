package com.company;

import com.company.paquete2.Animal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona persona = new Persona();
        //Persona persona = new Persona();
//        persona.nombre = "Raúl";
//        persona.edad = 29;
        Animal animal = new Animal();
        //No se puede ingresar desde un paquete poder el tipo default a menos que se le cambie el modificaor
        animal.nombre = "Iguana";

    }
}
