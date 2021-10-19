package com.company;

import com.company.banco.CuentaBancaria;
import com.company.paquete2.Animal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Raúl Rampírez");
        cuenta.setClave("BBVA125689");
        //cuenta.setSaldo(1800);
        System.out.println("El saldo es: " + cuenta.getSaldo());
        cuenta.mostrarSaldo();
        System.out.println(cuenta.toString());
//        Persona persona = new Persona();
//        //Persona persona = new Persona();
////        persona.nombre = "Raúl";
////        persona.edad = 29;
//        Animal animal = new Animal();
//        //No se puede ingresar desde un paquete poder el tipo default a menos que se le cambie el modificaor
//        animal.nombre = "Iguana";

    }
}
