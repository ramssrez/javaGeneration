package com.company;

import com.company.banco.CuentaBancaria;
import com.company.encapsulamieno.Persona;
import com.company.paquete2.Animal;

public class Main {
    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;


    public static void main(String[] args) {
        System.out.println("Antes de hacer la división");
        try {
            division = numerador/denominador;
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage() + "Null Pointer");
        }catch (Exception ex){
            System.out.println(ex.getMessage() + "Exception");
        }
        System.out.println("Despues de la división");

        /*
        Muestra cómo se implementó el método findPersonByName.
Crea una bifurcación y modifícala implementando el método findPersonById en la clase PersonService.
Crea una segunda bifurcación del código donde agreguen una segunda estructura de datos: HashMap <Person> para encontrar usuarios por ID.
Sugerencias:
usa la identificación de persona como clave.
Deberías usar put en lugar de add.
https://replit.com/@santiagocarrill/obj-collections
         */





	// write your code here
//        CuentaBancaria cuenta = new CuentaBancaria();
//        cuenta.setNombre("Raúl Rampírez");
//        cuenta.setClave("BBVA125689");
//        cuenta.setSaldo(1800000);
//        System.out.println("El saldo es: " + cuenta.getSaldo());
//        cuenta.mostrarSaldo();
//        System.out.println(cuenta.toString());

//        Persona persona = new Persona();
//        persona.setNombre("Raúl Ramírez");
//        persona.setEdad(29);
//        System.out.println("Nombre: " + persona.getNombre() + ", edad: " + persona.getEdad() + ", id: " + persona.getIdPersona());
//        System.out.println(persona.toString());
//
//        Persona persona2 = new Persona();
//        persona2.setNombre("Raúl Ramírez");
//        persona2.setEdad(29);
//        System.out.println(persona2.toString());

//        Persona persona = new Persona();
//        //Persona persona = new Persona();
////        persona.nombre = "Raúl";
////        persona.edad = 29;
//        Animal animal = new Animal();
//        //No se puede ingresar desde un paquete poder el tipo default a menos que se le cambie el modificaor
//        animal.nombre = "Iguana";

    }
}
