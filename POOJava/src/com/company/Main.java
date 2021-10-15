package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Perro perro = new Perro();
        perro.caracteristicas();
        perro.name = "Firulais";
        perro.edad = 3;
        perro.size = "50 cm";
        perro.raza = "Golondrino";
        String s = perro.toString();
        System.out.println(s);
        perro.jugar();
        perro.comer();
        perro.dormir();
        perro.caracteristicas();
    }
}
