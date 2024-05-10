package user;

/**
 * Admin
 */
public class Admin extends User {
  private String isAdmin;

  public Admin(String isAdmin, String nama, String alamat) {
    super(nama, alamat);
    this.isAdmin = isAdmin;
  }

  public String getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
  }

}