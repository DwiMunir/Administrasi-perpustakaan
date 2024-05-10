package buku;

/**
 * Pengarang
 */
public class Pengarang {
  private String nama;

  public Pengarang(String nama) {
    this.nama = nama;
  }

  // setter dan getter
  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  @Override
  /**
   * toString
   */
  public String toString() {
    return nama;
  }
}