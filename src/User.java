import java.time.LocalDate;

public class User {
  private Long id;
  private String username;
  private String password;
  private String email;
  private String createAt;

  public User(String username, String email, String password) {

    this.username = username;
    this.email = email;
    this.password = password;
    this.createAt = LocalDate.now().toString();
  }

  public void setId(Long id) {
    this.id = id;
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

  public String getCreateAt() {
    return createAt;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", email='" + email + '\'' +
            ", createAt='" + createAt + '\'' +
            '}';
  }
}
