package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pizza: ");
        Pepperoni pepperoni = new Pepperoni(40, 650, true);
        Margarita margarita = new Margarita(35, 480, false);
        LaFinta laFinta = new LaFinta(45, 740, true);

        Pizza pizPepperoni = new Pizza();
        System.out.println();
        if (pizPepperoni.preparingPepperoni(pepperoni)) {   //change
            System.out.println("Preparing pizza Pepperoni");
        } else {
            System.out.println();
        }
        pizPepperoni.printInfo();


        Pizza pizMargarita = new Pizza();
        System.out.println();
        if (pizMargarita.preparingMargarita(margarita)) {   //change
            System.out.println("Preparing pizza Margarita");
        } else {
            System.out.println();
        }
        pizMargarita.printInfoMg();


        Pizza pizLaFinta = new Pizza();
        System.out.println();
        if (pizLaFinta.preparingLaFinta(laFinta)){
            System.out.println("Preparing pizza La Finta");
        } else {
            System.out.println();
        }
        pizLaFinta.printInfoLa();
}
}