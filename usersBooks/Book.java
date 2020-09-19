public class Book {

    Author author;
    int pages;
    int year;
    String name;

    public Book(Author author, int pages, int year, String name) {
      this.author = author;
      this.pages = pages;
      this.year = year;
      this.name = name;
    }
}