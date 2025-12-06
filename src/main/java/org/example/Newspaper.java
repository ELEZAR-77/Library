package org.example;

import java.util.Objects;

public class Newspaper extends Publication implements Printable{
    private String publicationDay;

    public Newspaper(String publicationDay, String title, String author, int year) {
        super(title, author, year);
        this.publicationDay = publicationDay;
    }

    @Override
    public String getType() {
        return "Newspaper";
    }

    public String getPublicationDay() {
        return publicationDay;
    }

    public void setPublicationDay(String publicationDay) {
        this.publicationDay = publicationDay;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "publicationDay='" + publicationDay + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(super.equals(o))) return false;
        Newspaper newspaper = (Newspaper) o;
        return Objects.equals(publicationDay, newspaper.publicationDay);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (publicationDay != null ? publicationDay.hashCode() : 0);
        return result;
    }

    @Override
    public void printDetails() {
        System.out.println("===============================================");
        System.out.println("День публикации: " + publicationDay);
        System.out.println("Название книги: " + getTitle());
        System.out.println("Автор: " + getAuthor());
        System.out.println("Год публикации: " + getYear());
        System.out.println("===============================================");
    }
}
