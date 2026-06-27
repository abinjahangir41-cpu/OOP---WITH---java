public class LibraryBook {
    private String title;
    private String author;
    private String isbn;

    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void updateDetails(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("The physics of engineers", "F.ramchandra", "00000000000000");
        book.displayBookInfo();
    }
}