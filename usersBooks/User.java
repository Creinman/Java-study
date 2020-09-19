public class User {
  String email;
  String name;
  String surname;
  Book book;

  public User(String email, String name, String surname, Book book) {
    this.email = email;
    this.name = name;
    this.surname = surname;
    this.book = book;
  }

  public String toString() {
        return name + " "
        + surname + ", email: "
        + email + " \n" 
        + "читает книгу: "
        + book.name + " автора "
        + book.author.surname;
              
  }
}