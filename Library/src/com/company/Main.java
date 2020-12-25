package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Library: ");
        Artistic artistic = new Artistic("9789056622824", "Rob Perree", 2002);
        Juristic juristic = new Juristic("9781138052840", "Roger Cotterrell", 2017);
        Technical technical = new Technical("9781457501197", "Eric Evans", 2003);

        Library lib = new Library();
        lib.addBook(new Artistic("9780870701511", "Riva Castleman",1995));

        System.out.println();
        if(lib.addBook(artistic)){
            System.out.println("Book was add");
        }
        System.out.println();
        lib.printInfo();
    }


}
