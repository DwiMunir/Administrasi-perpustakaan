package buku;

/**
 * Penerbit
 */
public class Penerbit {
  private String nama;

  public Penerbit(String nama) {
    this.nama = nama;
  }

  // setter dan getter
  /**
   * @param nama the nama to set
   */
  public void setNama(String nama) {
    this.nama = nama;
  }

  /**
   * @return the nama
   */
  public String getNama() {
    return nama;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return nama;
  }
}