package homework12;

import java.util.Objects;

public class Book {
    private final String nameOfBook;
    private final Author author;
    private int year;

    public Book (String nameOfBook, Author author, int year) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.year = year;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, author);
    }
}
