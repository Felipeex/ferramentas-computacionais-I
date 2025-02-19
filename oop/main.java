import entities.User;

public class main {
  public static void main(String[] args) {
    User user = new User("Felipe");
    User user1 = new User("Felipe");
    System.out.println(user.equals(user1));
  }
}