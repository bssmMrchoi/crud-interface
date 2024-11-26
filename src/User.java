import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
  private Long id;
  private String name;
  private String email;
  private String password;
  private LocalDateTime createdAt;

  public User(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
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

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String toString() {
    return String.format("%-10s", name) + String.format("%-30s", email) + String.format("%-20s", password) + String.format("%-30s", createdAt);
  }
}
