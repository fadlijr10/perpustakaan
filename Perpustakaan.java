// Perpustakaan.java
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Buku> koleksiBuku = new ArrayList<>();
    private List<AnggotaPerpustakaan> anggotaList = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
        System.out.println("Buku ditambahkan ke perpustakaan: " + buku.getJudul());
    }

    public void tambahAnggota(AnggotaPerpustakaan anggota) {
        anggotaList.add(anggota);
        System.out.println("Anggota ditambahkan: " + anggota.getNama());
    }

    public void pinjamBuku(AnggotaPerpustakaan anggota, Buku buku) {
        if (anggotaList.contains(anggota)) {
            if (buku.isTersedia()) {
                buku.dipinjam();
                System.out.println(anggota.getNama() + " berhasil meminjam buku: " + buku.getJudul());
            } else {
                System.out.println("Maaf, buku " + buku.getJudul() + " sedang tidak tersedia.");
            }
        } else {
            System.out.println("Maaf, " + anggota.getNama() + " bukan anggota perpustakaan.");
        }
    }

    public void daftarBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        if (koleksiBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam koleksi.");
        } else {
            for (Buku buku : koleksiBuku) {
                System.out.println(buku);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan beberapa buku ke perpustakaan
        perpustakaan.tambahBuku(new Buku("Java Programming", "John Doe"));
        perpustakaan.tambahBuku(new Buku("Python Basics", "Jane Smith"));

        // Menambahkan anggota perpustakaan
        perpustakaan.tambahAnggota(new AnggotaPerpustakaan("Alice", 101));
        perpustakaan.tambahAnggota(new AnggotaPerpustakaan("Bob", 102));

        // Menampilkan daftar buku
        perpustakaan.daftarBuku();

        // Meminjam buku oleh anggota perpustakaan
        AnggotaPerpustakaan anggotaAlice = perpustakaan.anggotaList.get(0);
        Buku bukuDipinjam = perpustakaan.koleksiBuku.get(0);
        perpustakaan.pinjamBuku(anggotaAlice, bukuDipinjam);

        // Menampilkan daftar buku setelah peminjaman
        perpustakaan.daftarBuku();
    }
}
