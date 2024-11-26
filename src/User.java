import java.time.LocalDate;

public class User {
  private Long id;
  private String name;
  private String password;
  private String email;
  private String createAt;;
  static private Long count = 1L;

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

  public User(String name, String password, String email) {
    this.id = count++;
    this.createAt = LocalDate.now().toString();
    this.name = name;
    this.password = password;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
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
}
