package org.example;

public abstract class Publication {
    private final int id;

    private String title;
    private String author;
    private int year;
    private static int publicationCount = 0;

    public Publication(String title, String author, int year) {
        publicationCount ++;
        this.id = publicationCount;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public static int getPublicationCount() {
        return publicationCount;
    }

    public static void setPublicationCount(int publicationCount) {
        Publication.publicationCount = publicationCount;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "[id=" + id + "]" +
                " Publication{" +
                "title=" + title + '\'' +
                ", author=" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication publication = (Publication) o;
        return (title != null ? title.equals(publication.title) : publication.title == null ) && (author != null ? author.equals(publication.author) : publication.author == null) && year == publication.year;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }
}
