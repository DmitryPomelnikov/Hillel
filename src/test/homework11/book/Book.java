package test.homework11.book;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        System.out.println("Введите имя автора");
        author.setAuthor(scanner.nextLine());
        System.out.println("Введите название книги");
        title.setTitle(scanner.nextLine());
        System.out.println("Введите содержание произведения");
        content.setContent(scanner.nextLine());
        scanner.close();

        author.show();
        title.show();
        content.show();
    }
}
