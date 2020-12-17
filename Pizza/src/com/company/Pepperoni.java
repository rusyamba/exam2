package com.company;

public class Pepperoni {
    int width;
    int price;
    boolean spicy;

    public void printInfo(){
        System.out.println("Pepperoni: width - " + width + ", Price - " + price + ", Spicy - " + spicy);
    }

    public Pepperoni(int width, int price, boolean spicy) {
        this.width = width;
        this.price = price;
        this.spicy = spicy;
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

    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }


}
