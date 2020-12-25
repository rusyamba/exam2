package com.company;

import org.w3c.dom.ls.LSOutput;

public class Pizza {
    Pepperoni[] pepperoni;
    Margarita[] margarita;
    LaFinta[] laFinta;

    public Pizza(){}



     public boolean preparingPepperoni(Pepperoni pepperoni){
        for(int i = 0; i < this.pepperoni.length; i++){
            if(this.pepperoni[i] == null){
                this.pepperoni[i] = pepperoni;
                return true;
            }
        }
        return false;
     }

   public boolean preparingMargarita(Margarita margarita){
        for(int i = 0; i < this.margarita.length; i++){
            if(this.margarita[i] == null){
                this.margarita[i] = margarita;
                return true;
            }
        }
        return false;
   }

   public boolean preparingLaFinta(LaFinta laFinta){
        for(int i = 0; i < this.laFinta.length; i++){
            if(this.laFinta[i] == null){
                this.laFinta[i] = laFinta;
                return true;
            }
        }
        return false;
   }

    public void printInfo(){
        System.out.println("Pizza: ");
        for(int i = 0; i < pepperoni.length; i++){
            if(pepperoni[i] != null)
                pepperoni[i].printInfo();
        }
    }

    public void printInfoMg(){
        System.out.println("Pizza: ");
        for(int i = 0; i < margarita.length; i++){
            if(margarita[i] != null)
                margarita[i].printInfo();
        }
    }

    public void printInfoLa(){
        System.out.println("Pizza: ");
        for(int i = 0; i < laFinta.length; i++){
            if(laFinta[i] != null)
            laFinta[i].printInfo();
        }
    }
}