package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private final List<Publication> publications = new ArrayList<>();


    public void addPublication(Publication pub) {
        publications.add(pub);
    }

    public void removePublication(int id) {
        boolean found = false;

        Iterator<Publication> iterator = publications.iterator();
        while (iterator.hasNext()) {
            Publication publication = iterator.next();
            if (publication.getId() == id) {
                System.out.println("Публикация: " + publication + " - была удалена");
                iterator.remove();
                found = true;
            }
        }

        if (id > publications.size()) {
            System.out.println("Публикации с таким id нет");
        } else if (!found) {

            System.out.println("Неизвестная команда!");
        }
    }

    public void listPublications() {
        if (publications.isEmpty()) System.out.println("Публикаций пока нету");

        for(Publication pub : publications) {
            System.out.println(pub);
        }
    }

    public void searchByAuthor(String author) {
        boolean found = false;

        for (Publication publication : publications) {
            if (publication.getAuthor().equals(author)) {
                System.out.println(publication);
                found = true;
            }
        }

        if(!found) {
            System.out.println("Автор в каталоге отсутствует");
        }
    }
}
