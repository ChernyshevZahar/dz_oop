package dz1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> catalog;  
  
    public Library() {  
        catalog = new ArrayList<>();  
    }  
  
    public void addBook(Book book) {  
        catalog.add(book);  
    }  
  
    public void removeBook(Book book) {  
        catalog.remove(book);  
    }  
  
    public void displayAvailableBooks() {  
        System.out.println("Доступные книги:");  
        for (Book book : catalog) {  
            if (book.isAvailable()) {  
                book.displayInfo();  
                System.out.println();  
            }  
        }  
    }  
  
    public void searchByTitle(String title) {  
        System.out.println("Книги автора " + title + ":");  
        for (Book book : catalog) {  
            if (book.getTitle().equalsIgnoreCase(title)) {  
                book.displayInfo();  
                System.out.println();  
            }  
        }  
    } 
    public void searchByAuthor(String author) {  
        System.out.println("Книги автора " + author + ":");  
        for (Book book : catalog) {  
            if (book.getAuthor().equalsIgnoreCase(author)) {  
                book.displayInfo();  
                System.out.println();  
            }  
        }  
    }
}
