public class User {
  public String email;
  public String name;
  public String surname;
  public static int usersOnline = 0;

  public User(String email, String name, String surname) {
    this.email = email;
    this.name = name;
    this.surname = surname;
    usersOnline++;
  }
  /*void totalOnline() {
      usersOnline++;
  }
  */

  public String toString() {
    return email + " " +
           name + " " + 
           surname;
  }

}