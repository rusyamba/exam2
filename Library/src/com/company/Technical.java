package com.company;

public class Technical {
    private String identifier;
    private String author;
    private int date;
    private boolean computer;

    public Technical(){}

    public void printInfo(){
        System.out.println("Technical department: Identifier - " + identifier +
                ", Author - " + author + ", Date - " + date);
    }

    public Technical(boolean computer) {
        this.computer = computer;
    }

    public boolean getComputer() {
        return computer;
    }

    public void setComputer(boolean computer) {
        this.computer = computer;
    }

    public Technical(String identifier, String author, int date) {
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
