
public class Konten {
    private String tipeKonten;
    private String idTipeKonten;
    private String bahasa;
    private String judul;

    public Konten(String tipeKonten, String idTipeKonten, String bahasa, String judul) {
        this.tipeKonten = tipeKonten;
        this.idTipeKonten = idTipeKonten;
        this.bahasa = bahasa;
        this.judul = judul;
    }

    public String addBahasa(String bahasa) {
        this.bahasa = bahasa;
        return "Bahasa ditambahkan: " + bahasa;
    }

    public String ubahBahasa(String ubah) {
        this.bahasa = ubah;
        return "Bahasa diubah menjadi: " + ubah;
    }

    public String getJudul() {
        return this.judul;
    }

    public void tampilkanInfo() {
        System.out.println("Tipe Konten: " + tipeKonten);
        System.out.println("ID Tipe Konten: " + idTipeKonten);
        System.out.println("Bahasa: " + bahasa);
        System.out.println("Judul: " + judul);
    }
}
