package com.company;

public class Perro {
    /*private*/ String name;
    /*private*/ String raza;
    /*private*/ Integer edad;
    /*private*/ String size;

    public Perro(){

    }

    public Perro(String name){
        this.name = name;
    }

    public Perro(String name, String raza, int edad, String size){
        this.name = name;
        this.raza = raza;
        this.edad = edad;
        this.size = size;
    }

    public void caracteristicas(){
        System.out.println("Hola mi nombre es: " + this.name + ", soy de raza " + this.raza +
                " tengo " + this.edad + " soy de tamaño " + this.size);
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    public void dormir(){
        System.out.println("zzzzzzzzzzz");
    }
    public void jugar(){
        System.out.println("Estoy jugando");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "name='" + name + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", size='" + size + '\'' +
                '}';
    }
}
