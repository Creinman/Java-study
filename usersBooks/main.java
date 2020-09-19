public class Main {
  public static void main(String[] args) {
    System.out.println("Programm started: \n");

    Author author = new Author("Steven", "King", "04.05.1950", "USA");
    Book book = new Book(author, 1000, 2000, "Somename");
    Book book2 = new Book(author, 500, 1997, "Somename2");
    User user = new User("somemail", "Lecha", "Surname,", book);
    System.out.println(user.toString());
  }
}