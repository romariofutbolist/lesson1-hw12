package homework12;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author (String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public String toString() {
        return this.authorName + this.authorSurname;
    }
}
