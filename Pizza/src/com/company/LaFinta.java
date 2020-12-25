package com.company;

public class LaFinta {
    int width;
    int price;
    boolean mushroom;

    public void printInfo(){
        System.out.println("La Finta: width - " + width + ", Price - " + price + ", Mushrooms - " + mushroom);
    }

    public LaFinta(int width, int price, boolean mushroom) {
        this.width = width;
        this.price = price;
        this.mushroom = mushroom;
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

    public boolean isMushroom() {
        return mushroom;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }
}
