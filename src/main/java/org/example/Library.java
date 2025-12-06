package org.example;

import java.util.List;

public class Library {
    private List<Publication> publications;


    public void addPublication(Publication pub) {
        publications.add(pub);
    }

    public void listPublications() {
        for(Publication pub : publications) {
            System.out.println(pub);
        }
    }

    public void searchByAuthor(String author) {
        for (Publication publication : publications) {
            if (publication.getAuthor().equals(author)) {
                System.out.println(publication);
            }
        }
    }
}
