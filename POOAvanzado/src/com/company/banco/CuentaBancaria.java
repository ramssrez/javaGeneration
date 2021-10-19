package com.company.banco;

public class CuentaBancaria {
    private String nombre;
    private String clave;
    private float saldo;

    public String getNombre(){
        return this.nombre;
    }
    public String getClave(){
        return this.clave;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void  mostrarSaldo(){
        System.out.println(this.saldo);
    }
}
