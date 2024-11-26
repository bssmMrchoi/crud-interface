import java.time.LocalDate;

public class User {
  Long id;
  String name;
  String email;
  String password;
  String createAt;
  static private Long idcnt = 1L;
  public User(String name, String email, String password) {
    LocalDate now = LocalDate.now();
    this.id = idcnt++;
    this.name = name;
    this.email = email;
    this.password = password;
    this.createAt = now.toString();
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

  public Long getId() {
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
}
