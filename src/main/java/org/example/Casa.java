package org.example;

import java.awt.*;

public class Casa {
    private String direccion;
    private int manzana;
    private double altura;
    private Color color;
    private int pisos;

    public Casa() {
    }

    public Casa(String direccion, int manzana, double altura, Color color, int pisos) {
        this.direccion = direccion;
        this.manzana = manzana;
        this.altura = altura;
        this.color = color;
        this.pisos = pisos;
    }

    public Casa(String direccion, Color color) {
        this.direccion = direccion;
        this.color = color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getManzana() {
        return manzana;
    }

    public void setManzana(int manzana) {
        this.manzana = manzana;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", manzana=" + manzana +
                ", altura=" + altura +
                ", color=" + color +
                ", pisos=" + pisos +
                '}';
    }
    public String calidad(){
        String paredes = "Blocks de cemento";
        return paredes;

    }
    public boolean solid(){
        boolean casa = Math.random() > 0.51;
        return casa;
    }
    public String cercania(){
        String cerca = ("10 km");
        return cerca;
    }
}
