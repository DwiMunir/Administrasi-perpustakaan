import buku.*;
import user.*;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Buku> listBuku = new ArrayList<Buku>();
    ArrayList<Pengunjung> listPengunjung = new ArrayList<Pengunjung>();
    ArrayList<Admin> listAdmin = new ArrayList<Admin>();
    ArrayList<Anggota> listAnggota = new ArrayList<Anggota>();
    ArrayList<Peminjaman> listPeminjaman = new ArrayList<Peminjaman>();

    // add penerbit dan pengarang
    Penerbit erlangga = new Penerbit("Erlangga");
    Penerbit grameida = new Penerbit("Gramedia");
    Penerbit bukune = new Penerbit("Bukune");

    Pengarang tereLiye = new Pengarang("Tere Liye");
    Pengarang radityaDika = new Pengarang("Raditya Dika");

    // tambahkan beberapa buku ke dalam daftar buku
    Buku ceritaSaya = new Buku("Cerita Saya", tereLiye, erlangga);
    Buku belajarJava = new Buku("Belajar Java", radityaDika, grameida);
    Buku cintaDanKeluarga = new Buku("Cinta dan Keluarga", tereLiye, bukune);

    listBuku.add(ceritaSaya);
    listBuku.add(belajarJava);
    listBuku.add(cintaDanKeluarga);

    // tambahkan beberapa user ke dalam daftar user
    User anggota1 = new Anggota("Anggota 1", "Jl. Anggota 1", "08123456789");
    User anggota2 = new Anggota("Anggota 2", "Jl. Anggota 2", "08123456789");
    User anggota3 = new Anggota("Anggota 3", "Jl. Anggota 3", "08123456789");

    // tambahkan pengunjung
    User pengunjung1 = new Pengunjung("Pengunjung 1", "Jl. Pengunjung 1", "08123456789");
    User pengunjung2 = new Pengunjung("Pengunjung 2", "Jl. Pengunjung 2", "08123456789");

    // tambahkan admin
    User admin1 = new Admin("Admin 1", "Jl. Admin 1", "08123456789");
    User admin2 = new Admin("Admin 2", "Jl. Admin 2", "08123456789");

    listAnggota.add((Anggota) anggota1);
    listAnggota.add((Anggota) anggota2);
    listAnggota.add((Anggota) anggota3);

    listPengunjung.add((Pengunjung) pengunjung1);
    listPengunjung.add((Pengunjung) pengunjung2);

    listAdmin.add((Admin) admin1);
    listAdmin.add((Admin) admin2);

    // tampilkan daftar admin, pengunjung, dan anggota
    System.out.println("\nDaftar Admin");
    for (Admin admin : listAdmin) {
      System.out.println("\tNama: " + admin.getName());
      System.out.println("\tAlamat: " + admin.getAlamat());
      System.out.println("\tis Admin: " + admin.getIsAdmin());
      System.out.println();
    }

    System.out.println("\nDaftar Pengunjung");
    for (Pengunjung pengunjung : listPengunjung) {
      System.out.println("\tNama: " + pengunjung.getName());
      System.out.println("\tAlamat: " + pengunjung.getAlamat());
      System.out.println("\tNo. KTP: " + pengunjung.getNoKtp());
      System.out.println();
    }

    System.out.println("\nDaftar Anggota");
    for (Anggota anggota : listAnggota) {
      System.out.println("\tNama: " + anggota.getName());
      System.out.println("\tAlamat: " + anggota.getAlamat());
      System.out.println("\tNo. Anggota: " + anggota.getNoAnggota());
      System.out.println();
    }

    // tampilkan daftar buku
    System.out.println("Daftar Buku");
    for (Buku buku : listBuku) {
      System.out.println("\tJudul: " + buku.getJudul());
      System.out.println("\tPengarang: " + buku.getPengarang().getNama());
      System.out.println("\tPenerbit: " + buku.getPenerbit().getNama());
      System.out.println();
    }

    // tambahkan peminjam buku
    Peminjaman peminjaman1 = new Peminjaman("2024-05-10", "2024-05-17", "Dipinjam", (Anggota) anggota1, ceritaSaya);
    Peminjaman peminjaman2 = new Peminjaman("2024-05-08", "2024-05-15", "Dipinjam", (Anggota) anggota2, belajarJava);

    listPeminjaman.add(peminjaman1);
    listPeminjaman.add(peminjaman2);

    // menampilkan daftar peminjaman
    System.out.println("\nDaftar Peminjaman");
    for (Peminjaman peminjaman : listPeminjaman) {
      System.out.println("\tJudul Buku: " + peminjaman.getBuku().getJudul());
      System.out.println("\tPeminjam: " + peminjaman.getAnggota().getName());
      System.out.println("\tTanggal Pinjam: " + peminjaman.getTglPinjam());
      System.out.println("\tTanggal Kembali: " + peminjaman.getTglKembali());
      System.out.println("\tStatus: " + peminjaman.getStatus());
      System.out.println();
    }
  }

}