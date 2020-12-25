package com.company;

public class Artistic {
    private String identifier;
    private String author;
    private int date;


    public Artistic(){}

    public void printInfo(){
        System.out.println("Artistic department: Identifier - " + identifier
                + ", Author - " + author + ", Date - " + date);
    }

    public Artistic(String identifier, String author, int date) {
        this.identifier = identifier;
        this.author = author;
        this.date = date;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
