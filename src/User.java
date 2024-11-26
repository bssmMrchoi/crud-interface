public class User {
  private int id;
  private String username;
  private String password;
  private String email;

  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "User{" +
            "username=" + username +
            ", email=" + email +
            ", password=" + password +
            '}';
  }
}
