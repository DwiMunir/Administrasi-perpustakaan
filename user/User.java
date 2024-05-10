package user;

/**
 * User
 */
public class User {
  private String name, alamat;

  public User(String name, String alamat) {
    this.name = name;
    this.alamat = alamat;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }
}