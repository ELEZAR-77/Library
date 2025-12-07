package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Publication book1 = new Book("1", "451 градус по фаренгейту", "Рэй Брэдберри", 1953);
        Book book2 = new Book("2", "Мы", "Замятин", 1924);
        Publication magazine1 = new Magazine(1, "Про прошедшее и непрошедшее время", "Александр Мещеряков", 2025);
        Magazine magazine2 = new Magazine(2, "Империя Илона Маска, или все не то, чем кажется?", "Денис Альбин", 2023);
        Publication newspaper1 = new Newspaper("Среда", "Начало декабря в Москве стало бесснежным", "Олег Елков", 2025);
        Newspaper newspaper2 = new Newspaper("Воскресенье", "Бесплатная новогодняя ярморка!", "Евгений Барсук", 2025);
        Printable book3 = new Book("3", "Собачье сердце", "Булгаков", 1925);

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        library.addPublication(book1);
        library.addPublication(book2);
        library.addPublication(magazine1);
        library.addPublication(magazine2);
        library.addPublication(newspaper1);
        library.addPublication(newspaper2);
        library.addPublication((Publication) book3);

        while (true) {
            System.out.println("Выберите тим публикации: 1 - Book, 2 - Magazine, 3 - Newspaper," +
                                                                            " 4 - поиск по автору," +
                                                                            " 5 - все публикации," +
                                                                            " 6 - кол-во публикаций: " +
                                                                            " 7 - удалить публикацию" +
                                                                            " 0 - выход");

            int publicationType = sc.nextInt();
            sc.nextLine();

            switch (publicationType) {
                case (1):
                    System.out.print("Введите название: ");
                    String bookTitle = sc.nextLine();

                    System.out.print("Введите автора: ");
                    String bookAuthor = sc.nextLine();

                    System.out.print("Введите год: ");
                    int bookYear = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Введите iSBN: ");
                    String iSBN = sc.nextLine();

                    Printable book = new Book(iSBN, bookTitle, bookAuthor, bookYear);
                    library.addPublication((Publication) book);

                    break;

                case (2):
                    System.out.print("Введите название: ");
                    String magazineTitle = sc.nextLine();

                    System.out.print("Введите автора: ");
                    String magazineAuthor = sc.nextLine();

                    System.out.print("Введите год: ");
                    int magazineYear = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Введите номер журнала: ");
                    int issueNumber = sc.nextInt();
                    sc.nextLine();

                    Printable magazine = new Magazine(issueNumber, magazineTitle, magazineAuthor, magazineYear);
                    library.addPublication((Publication) magazine);

                    break;

                case (3):
                    System.out.print("Введите название: ");
                    String newsTitle = sc.nextLine();

                    System.out.print("Введите автора: ");
                    String newsAuthor = sc.nextLine();

                    System.out.print("Введите год: ");
                    int newsYear = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Введите день публикации: ");
                    String publicationDay = sc.nextLine();

                    Printable newspaper = new Newspaper(publicationDay, newsTitle, newsAuthor, newsYear);
                    library.addPublication((Publication) newspaper);

                    break;

                case (4):
                    System.out.print("Введите имя автора: ");
                    String authorName = sc.nextLine();

                    library.searchByAuthor(authorName);

                    break;
                case (5):
                    System.out.println("Вот все что в каталоге: ");
                    library.listPublications();
                    break;

                case (6):
                    System.out.println("Кол-во публикаций в каталоге: " + Publication.getPublicationCount());

                case (7):
                    library.listPublications();
                    System.out.println();

                    System.out.println("Введите id автора из списка чтобы удалить публикацию: ");
                    int removeAuthor = sc.nextInt();
                    sc.nextLine();

                    library.removePublication(removeAuthor);
                    break;
                case (0):
                    System.out.println("Выход из программы...");
                    return;

                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }
}