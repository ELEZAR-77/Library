package org.example;

import java.util.Objects;

public class Book extends Publication implements Printable{
    private String iSBN;

    public Book(String iSBN, String title, String author, int year) {
        super(title, author, year);
        this.iSBN = iSBN;
    }

    @Override
    public String getType() {
        return "Book";
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "iSBN='" + iSBN + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(iSBN, book.iSBN);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (iSBN != null ? iSBN.hashCode() : 0);
        return result;
    }

    @Override
    public void printDetails() {
        System.out.println("===============================================");
        System.out.println( "Номер: " + iSBN);
        System.out.println("Название книги: " + getTitle());
        System.out.println("Автор: " + getAuthor());
        System.out.println("Год публикации: " + getYear());
        System.out.println("===============================================");
    }
}
