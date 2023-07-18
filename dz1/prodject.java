package dz1;

public class prodject {

    public static void main(String[] args) {
        // Cat Cat = new Cat();
        // Cat.Setter(10, "Wasia");
        // System.out.println(Cat.greet());

        // Rectangle Rectangle = new Rectangle(10,10);

        // System.out.println(Rectangle.calculateArea());
        // System.out.println(Rectangle.calculatePerimeter());


        Library library = new Library();  
          
        Book book1 = new Book("Война и мир", "Лев Толстой");  
        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский");  
        Book book3 = new Book("Гарри Поттер и философский камень", "Джоан Роулинг");  
          
        library.addBook(book1);  
        library.addBook(book2);  
        library.addBook(book3);  
          
        // library.displayAvailableBooks();  
          
        // System.out.println("=== Поиск книги ===");  
        // library.searchByAuthor("Лев Толстой");  
        System.out.println("=== Поиск книги ===");  
        library.searchByTitle("Война и мир");
          
        // System.out.println("=== Удаление книги ===");  
        // library.removeBook(book2);  
          
        // library.displayAvailableBooks();

    }
    
}