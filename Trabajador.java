package com.example.prueba;

public class Trabajador extends Persona{
    private double sueldo;

    public Trabajador(String nombre, int edad, String sexo, double sueldo){
        super(nombre,edad,sexo);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}