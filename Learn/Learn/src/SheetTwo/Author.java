package SheetTwo;

import java.util.Arrays;

public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Author: " + name + " (" + email + ")";
    }

    public static class Book {
        private String ISBN;
        private String name;
        private Author [] authors;
        private String publisher;
        private double price;

        public Book(String ISBN, String name, Author [] authors, String publisher, double price) {
            this.ISBN = ISBN;
            this.name = name;
            this.authors = authors;
            this.publisher = publisher;
            this.price = price;
        }

        public void setISBN(String ISBN) { this.ISBN = ISBN; }
        public void setName(String name) { this.name = name; }
        public void setAuthor(Author [] authors) { this.authors = authors; }
        public void setPublisher(String publisher) { this.publisher = publisher; }
        public void setPrice(double price) { this.price = price; }

        public String getISBN() { return ISBN; }
        public String getName() { return name; }
        public Author [] getAuthor() { return authors; }
        public String getPublisher() { return publisher; }
        public double getPrice() { return price; }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Book)) return false;
            Book b = (Book) o;
            return this.ISBN.equals(b.ISBN);
        }

        @Override
        public String toString() {
            return "Book: " + name + "\nISBN: " + ISBN + "\nPublisher: " + publisher +
                    "\nPrice: " + price + "\n" + Arrays.toString(authors);
        }
    }
}
