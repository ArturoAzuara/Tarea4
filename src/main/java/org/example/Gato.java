package org.example;

import java.awt.*;
import java.sql.SQLSyntaxErrorException;

public class Gato {
    private String nombre;
    private byte edad;
    private String raza;
    private Color color;
    private float altura;

    public Gato() {
    }

    public Gato(String nombre, byte edad, String raza, Color color, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.altura = altura;
    }

    public Gato(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", color=" + color +
                ", tamaño=" + altura +
                '}';
    }
    public boolean ataca(){
        System.out.println("El michi, esta atacando???");
        boolean resultado = Math.random() > 0.51;
        return resultado;
    }
    public boolean duerme() {
        System.out.println(nombre + "El michi, esta durmiendo???");
        boolean zzz = Math.random() > 0.51;
        return zzz;
    }
    public String caminar() {
       String walk = "más de un km";
       return walk;
    }

}
