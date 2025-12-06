package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Publication book1 = new Book("A-1", "Idiot", "Dostoevsky", 1869);
        Book book2 = new Book("A-2", "Dogs heart", "Bulgakov", 1968);
        Printable book3 = new Book("A-3", "We", "Zamyatin", 1924);

        System.out.println(book1.equals(book2));
        book3.printDetails();
        System.out.println(Publication.getPublicationCount());

    }
}