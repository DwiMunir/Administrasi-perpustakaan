package user;

import buku.*;

/**
 * Peminjaman
 */
public class Peminjaman {
  private String tglPinjam, tglKembali, status;
  private Anggota anggota;
  private Buku buku;

  public Peminjaman(String tglPinjam, String tglKembali, String status, Anggota anggota,
      Buku buku) {
    this.tglPinjam = tglPinjam;
    this.tglKembali = tglKembali;
    this.status = status;
    this.anggota = anggota;
    this.buku = buku;
  }

  public String getTglPinjam() {
    return tglPinjam;
  }

  public void setTglPinjam(String tglPinjam) {
    this.tglPinjam = tglPinjam;
  }

  public String getTglKembali() {
    return tglKembali;
  }

  public void setTglKembali(String tglKembali) {
    this.tglKembali = tglKembali;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Anggota getAnggota() {
    return anggota;
  }

  public void setAnggota(Anggota anggota) {
    this.anggota = anggota;
  }

  public Buku getBuku() {
    return buku;
  }

  public void setBuku(Buku buku) {
    this.buku = buku;
  }
}