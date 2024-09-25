public class Artikel extends Konten {
    private String penulis;
    private String format;
    private String komentarPengguna;

    public Artikel(String tipeKonten, String idTipeKonten, String bahasa, String judul, String penulis, String format) {
        super(tipeKonten, idTipeKonten, bahasa, judul);
        this.penulis = penulis;
        this.format = format;
        this.komentarPengguna = "";
    }

    public String getPenulis() {
        return penulis;
    }

    public String getFormat() {
        return format;
    }

    public String addKomentar(String komentar) {
        this.komentarPengguna = komentar;
        return "Komentar ditambahkan: " + komentar;
    }

    public String hapusKomentar() {
        this.komentarPengguna = "";
        return "Komentar dihapus.";
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Penulis: " + penulis);
        System.out.println("Format: " + format);
        System.out.println("Komentar: " + komentarPengguna);
    }
}
