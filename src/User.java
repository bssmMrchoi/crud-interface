import java.time.LocalDate;

public class User {
  private Long id;
  private String name;
  private String password;
  private String email;
  private String createAt;

  public User(String name, String password, String email, String createAt) {
    this.name = name;
    this.password = password;
    this.email = email;
    this.createAt = LocalDate.now().toString();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCreateAt() {
    return createAt;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", email='" + email + '\'' +
            ", createAt='" + createAt + '\'' +
            '}';
  }
}
