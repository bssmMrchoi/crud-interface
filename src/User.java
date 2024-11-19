import java.time.LocalDate;
public class User {
  private Long id;
  private String password;
  private String name;
  private String email;
  private String CreatAt;
  public User(String password, String email, String name) {
    this.password = password;
    this.email = email;
    this.name = name;
    this.CreatAt = LocalDate.now().toString();
  }
  public Long getId() {
    return id;
  }
  public String getEmail() {
    return email;
  }
  public String getPassword() {
    return password;
  }
  public String getName() {
    return name;
  }
  public void setId(Long aLong) {
    id = aLong;
  }
  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", password='" + password + '\'' +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", CreatAt='" + CreatAt + '\'' +
            '}';
  }

  public void setName(String name) {
  }

  public void setEmail(String email) {
  }

  public void setPassword(String password) {
  }
}
