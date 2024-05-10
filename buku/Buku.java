package buku;

/**
 * Buku
 */
public class Buku {
  private String judul;
  private Pengarang pengarang;
  private Penerbit penerbit;

  public Buku(String judul, Pengarang pengarang, Penerbit penerbit) {
    this.judul = judul;
    this.pengarang = pengarang;
    this.penerbit = penerbit;
  }

  // setter dan getter
  public void setJudul(String judul) {
    this.judul = judul;
  }

  public String getJudul() {
    return judul;
  }

  public void setPengarang(Pengarang pengarang) {
    this.pengarang = pengarang;
  }

  public Pengarang getPengarang() {
    return pengarang;
  }

  public void setPenerbit(Penerbit penerbit) {
    this.penerbit = penerbit;
  }

  public Penerbit getPenerbit() {
    return penerbit;
  }

}