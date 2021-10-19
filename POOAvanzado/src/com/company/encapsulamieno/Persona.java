package com.company.encapsulamieno;

public class Persona {
    private Integer idPersona;
    private String nombre;
    private int edad;
    private static int contador;

    public Persona() {
        this.idPersona = ++Persona.contador;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
