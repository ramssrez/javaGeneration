package com.company.animales;

import com.company.animales.Animal;

public class Perro extends Animal implements Mascota, Mamiferos{
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
        System.out.println("Estoy durmiendo");
    }

    @Override
    public void hablar() {
        System.out.println("Estoy hablando");
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

    @Override
    public void gestar() {
        System.out.println("Estoy gestando");
    }

    @Override
    public void amamantar() {
        System.out.println("Estoy tomando leche");
    }

    @Override
    public void movilidad() {
        System.out.println("Estoy moviendome");
    }
}
