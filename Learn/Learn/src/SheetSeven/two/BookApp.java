package SheetSeven.two;

public class BookApp {
    static void main(String[] args) {
        try{
            BookManager bookManager = new BookManager();
            bookManager.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99));
            bookManager.addBook(new Book("1984", "George Orwell", 8.99));
            bookManager.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 12.99));
            bookManager.addBook(new Book("Pride and Prejudice", "Jane Austen", 9.99));
            String textFile = "books.txt";
            String binaryFile = "books.dat";
            bookManager.writeBooksToFile(textFile);
            System.out.println("Books written to text file:");
            BookManager bookManager2 = new BookManager();
            bookManager2.readBooksFromFile(textFile);
            bookManager.saveBooks(binaryFile);
            System.out.println("Books saved to binary file.");
            bookManager2.loadBooks(binaryFile);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
