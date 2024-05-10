package user;

/**
 * Anggota
 */
public class Anggota extends User {
  private String noAnggota;

  public Anggota(String nama, String alamat, String noAnggota) {
    super(nama, alamat);
    this.noAnggota = noAnggota;
  }

  public String getNoAnggota() {
    return noAnggota;
  }

  public void setNoAnggota(String noAnggota) {
    this.noAnggota = noAnggota;
  }
}