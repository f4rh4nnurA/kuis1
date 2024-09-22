import java.time.Duration;

public class Kursus {
    private String namaMapel;
    private String idMapel;
    private String kategori;
    private int harga;  
    private Duration durasi;

    public Kursus(String namaMapel, String idMapel, String kategori, int harga, Duration durasi) {
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif.");
        }
        if (durasi.isNegative() || durasi.isZero()) {
            throw new IllegalArgumentException("Durasi harus lebih dari 0.");
        }
        this.namaMapel = namaMapel;
        this.idMapel = idMapel;
        this.kategori = kategori;
        this.harga = harga;
        this.durasi = durasi;
    }

    public String getNamaMapel() {
        return namaMapel;
    }

    public String getIdMapel() {
        return idMapel;
    }

    public String getKategori() {
        return kategori;
    }

    public int getHarga() {
        return harga;
    }

    public Duration getDurasi() {
        return durasi;
    }

    public void setNamaMapel(String namaMapel) {
        if (namaMapel == null || namaMapel.isEmpty()) {
            throw new IllegalArgumentException("Nama mapel tidak boleh kosong.");
        }
        this.namaMapel = namaMapel;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Mapel: " + namaMapel);
        System.out.println("ID Mapel: " + idMapel);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Durasi: " + durasi.toHours() + " jam " + durasi.toMinutesPart() + " menit");
    }

    @Override
    public String toString() {
        return "Kursus{" +
                "namaMapel='" + namaMapel + '\'' +
                ", idMapel='" + idMapel + '\'' +
                ", kategori='" + kategori + '\'' +
                ", harga=" + harga +
                ", durasi=" + durasi.toHours() + " jam " + durasi.toMinutesPart() + " menit" +
                '}';
    }
}
