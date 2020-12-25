package com.company;

public class Margarita {
    int width;
    int price;
    boolean meat;

    public void printInfo(){
        System.out.println("Margarita: width - " + width + ", Price - " + price + ", Meat - " + meat);
    }

    public Margarita(int width, int price, boolean meat) {
        this.width = width;
        this.price = price;
        this.meat = meat;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isMeat() {
        return meat;
    }

    public void setMeat(boolean meat) {
        this.meat = meat;
    }
}
