package user;

public class Pengunjung extends User {
  private String noKtp;

  public Pengunjung(String nama, String alamat, String noKtp) {
    super(nama, alamat);
    this.noKtp = noKtp;
  }

  public String getNoKtp() {
    return noKtp;
  }

  public void setNoKtp(String noKtp) {
    this.noKtp = noKtp;
  }

}