package homework12;

class Main {

    public static void main(String[] args) {
        Author name = new Author("Ray", "Bradbury");
        Author name2 = new Author("Gabriel", "Marquez");
        Book first = new Book("Fahrenheit 451", name, 1953);
        Book second = new Book("Cien Anos de soledad", name2, 1967);

        System.out.println("Название: " + first.getBookName());
        System.out.println("Автор: " + first.getAuthorName());
        System.out.println("Год выпуска: " + first.getPublishingYear());
        System.out.println();

        System.out.println("Название: " + second.getBookName());
        System.out.println("Автор: " + second.getAuthorName());
        System.out.println("Год выпуска: " + second.getPublishingYear());
        second.setPublishingYear(1970);
        System.out.println("Год выпуска: " + second.getPublishingYear());

    }
}
