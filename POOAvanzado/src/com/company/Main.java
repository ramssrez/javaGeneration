package com.company;

import com.company.banco.CuentaBancaria;
import com.company.encapsulamieno.Persona;
import com.company.paquete2.Animal;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        CuentaBancaria cuenta = new CuentaBancaria();
//        cuenta.setNombre("Raúl Rampírez");
//        cuenta.setClave("BBVA125689");
//        cuenta.setSaldo(1800000);
//        System.out.println("El saldo es: " + cuenta.getSaldo());
//        cuenta.mostrarSaldo();
//        System.out.println(cuenta.toString());

        Persona persona = new Persona();
        persona.setNombre("Raúl Ramírez");
        persona.setEdad(29);
        System.out.println("Nombre: " + persona.getNombre() + ", edad: " + persona.getEdad() + ", id: " + persona.getIdPersona());
        System.out.println(persona.toString());

        Persona persona2 = new Persona();
        persona2.setNombre("Raúl Ramírez");
        persona2.setEdad(29);
        System.out.println(persona2.toString());

//        Persona persona = new Persona();
//        //Persona persona = new Persona();
////        persona.nombre = "Raúl";
////        persona.edad = 29;
//        Animal animal = new Animal();
//        //No se puede ingresar desde un paquete poder el tipo default a menos que se le cambie el modificaor
//        animal.nombre = "Iguana";

    }
}
