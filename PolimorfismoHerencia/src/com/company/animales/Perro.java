package com.company.animales;

import com.company.animales.Animal;

public class Perro extends Animal implements Mascota{
    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre){
        super(nombre);
        System.out.println("Constructor hijo (perro)");
    }

    @Override
    public void jugar(){
        System.out.println("Estoy jugando");
    }

    @Override
    public void dormir() {

    }

    @Override
    public void hablar() {

    }

    public void ladrar(){
        System.out.println("Grrrr goff goff!!!!");
    }

    @Override //sobreescribe este method, solo se puede porque se está heredando
    public void comer() {
        System.out.println("Como huesos y croquetas deliciosas!!");
    }

    @Override
    public void respirar() {
        System.out.println("Esta respirando el perro");
    }

}
