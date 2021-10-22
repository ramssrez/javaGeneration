package com.company.animales;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre){
        this.nombre = nombre;
        System.out.println("constructor padre");
    }

    public void comunicarse(){
        System.out.println("Hola");
    }

    public void comer() {
        System.out.println("Ñam!");
    }
    public abstract void respirar();

}
