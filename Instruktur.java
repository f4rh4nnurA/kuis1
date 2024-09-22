public class Instruktur {

    private String namaInstruktur, idInstruktur, jenisKelamin, bidangKeahlian;

    public Instruktur(String namaInstruktur, String idInstruktur, String jenisKelamin, String bidangKeahlian) {
        this.namaInstruktur = namaInstruktur;
        this.idInstruktur = idInstruktur;
        this.jenisKelamin = jenisKelamin;
        this.bidangKeahlian = bidangKeahlian;
    }

    public Konten tambahKonten(String tipeKonten, String idTipeKonten, String bahasa, String judul) {
        return new Konten(tipeKonten, idTipeKonten, bahasa, judul);
    }


    public void getInstruktur(){
        System.out.println("Instruktur : " + this.namaInstruktur);
        System.out.println("ID Instruktur : " + this.idInstruktur);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Bidang Keahlian : " + this.bidangKeahlian);
    }

}