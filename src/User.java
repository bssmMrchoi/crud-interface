import java.time.LocalDate;

public class User {
  private  Long id;
  private String name;
  private String email;
  private String password;
  private String createAt;

  public User(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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
