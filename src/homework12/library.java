package homework12;

class Main {

    public static void main(String[] args) {
        Author joanneRowling = new Author("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter", joanneRowling, 1981);
        Author josephKipling = new Author("Joseph", "Kipling");
        Book jungleBook = new Book("The Jungle Book", josephKipling, 1893);
        System.out.println("Название: " + harryPotter.getNameOfBook());
        System.out.println("Автор: " + harryPotter.getAuthor());
        System.out.println(joanneRowling.getName() + " " + joanneRowling.getSurname());
        System.out.println("Год публикации: " + harryPotter.getYear());
        harryPotter.setYear(1983);
        System.out.println("Год публикации: " + harryPotter.getYear());
        System.out.println();
        System.out.println("Название: " + jungleBook.getNameOfBook());
        System.out.println("Автор: " + jungleBook.getAuthor());
        System.out.println(josephKipling.getName() + " " + josephKipling.getSurname());
        System.out.println("Год публикации: " + jungleBook.getYear());






    }
}