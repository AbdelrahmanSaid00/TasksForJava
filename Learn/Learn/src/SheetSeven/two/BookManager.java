package SheetSeven.two;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class BookManager {
    private ArrayList<Book> books;
    public BookManager() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void writeBooksToFile(String filename) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(filename));
        for (Book book : books) {
            writer.println(book.toString());
        }
        writer.close();
    }
    public void readBooksFromFile (String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
    public void saveBooks (String filename) throws IOException {
        books.sort(Comparator.comparing(Book::getPrice).reversed());
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
        out.writeObject(books);
        out.close();
    }
    public void loadBooks (String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
        books = (ArrayList<Book>) in.readObject();
        in.close();
        for( Book book : books) {
            System.out.println(book);
        }
    }

}
