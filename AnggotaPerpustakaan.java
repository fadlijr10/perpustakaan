// AnggotaPerpustakaan.java
public class AnggotaPerpustakaan {
    private String nama;
    private int id;

    public AnggotaPerpustakaan(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AnggotaPerpustakaan{" +
                "nama='" + nama + '\'' +
                ", id=" + id +
                '}';
    }
}
