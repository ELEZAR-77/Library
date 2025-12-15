package org.example;

import java.util.Objects;

public class Magazine extends Publication implements Printable{
    private int issueNumber;

    public Magazine(int issueNumber, String title, String author, int year) {
        super(title, author, year);
        this.issueNumber =  issueNumber;
    }

    @Override
    public String getType() {
        return "Journal";
    }


    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(super.equals(o))) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(issueNumber, magazine.issueNumber);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + issueNumber;
        return result;
    }


    @Override
    public void printDetails() {
        System.out.println("===============================================");
        System.out.println( "Номер выпуска: " + issueNumber);
        System.out.println("Название книги: " + getTitle());
        System.out.println("Автор: " + getAuthor());
        System.out.println("Год публикации: " + getYear());
        System.out.println("===============================================");
    }
}
