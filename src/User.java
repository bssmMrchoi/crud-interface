import java.time.LocalDateTime;

public class User {
  private long id;
  private String name;
  private String email;
  private String password;
  private String createAt;

  public User(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.createAt =  LocalDateTime.now().toString();
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getCreateAt() {
    return createAt;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            ", createAt='" + createAt + '\'' +
            '}';
  }
}
