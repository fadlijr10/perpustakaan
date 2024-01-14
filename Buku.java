// Buku.java
public class Buku {
    private String judul;
    private String pengarang;
    private boolean tersedia;

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tersedia = true;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void dipinjam() {
        tersedia = false;
    }

    public void dikembalikan() {
        tersedia = true;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "judul='" + judul + '\'' +
                ", pengarang='" + pengarang + '\'' +
                ", tersedia=" + tersedia +
                '}';
    }
}
