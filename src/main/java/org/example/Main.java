package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Gato cat = new Gato("Michi","naranja");
        System.out.println(cat.ataca());
        System.out.println(cat.duerme());
        System.out.println("Cuanto camino el gato hoy: " + cat.caminar());
        System.out.println(cat);

        Casa house = new Casa("Jose Maria Morelos", Color.white);
        System.out.println("La casa esta hecha con: " + house.calidad());
        System.out.println("La casa es solida?" + house.solid());
        System.out.println("La distancia para llegar de casa a la escuela es: " + house.cercania());
        System.out.println(house);

    }

}