package com.company;

public class Library {
    Artistic[] artistic;
    Juristic[] juristic;
    Technical[] technical;

    public Library(){}

    public Library(int artistic, int juristic,int technical){
        this.artistic = new Artistic[artistic];
        this.juristic = new Juristic[juristic];
        this.technical = new Technical[technical];
    }

    public void printInfo(){
        System.out.println("Library artistic: ");
        for(int i = 0; i < artistic.length; i++){
            if(artistic[i] != null)
                artistic[i].printInfo();
        }

        System.out.println("lib juristic: ");
        for(int j = 0; j < juristic.length; j++){
            if(juristic[j] != null)
                juristic[j].printInfo();
        }

        System.out.println("lib technical: ");
        for(int t = 0; t < technical.length; t++){
            if(technical[t] != null)
                technical[t].printInfo();
        }
    }

    public boolean addBook(Artistic artisticBook){
        for(int i = 0; i < this.artistic.length; i++){
            if(this.artistic[i] == null){
                this.artistic[i] = artisticBook;
                return true;
            }
        }
        return false;
    }

    public Artistic[] getArtistic() {
        return artistic;
    }

    public void setArtistic(Artistic[] artistic) {
        this.artistic = artistic;
    }

    public Juristic[] getJuristic() {
        return juristic;
    }

    public void setJuristic(Juristic[] juristic) {
        this.juristic = juristic;
    }

    public Technical[] getTechnical() {
        return technical;
    }

    public void setTechnical(Technical[] technical) {
        this.technical = technical;
    }

    public String toString(){
        return "Library: "
                + "Artistic - " + artistic + ", Juristic - " +
                juristic + ", Technical - " + technical;
    }
}
