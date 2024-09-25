public class Ujian {
    int jumlahSoal;
    int nilai;
    String status; 
    String tanggalUjian;

    public Ujian(int jumlahSoal, int nilai, String tanggalUjian, String tipeKonten, String idTipeKonten, String bahasa, String judul) {
        this.jumlahSoal = jumlahSoal;
        this.nilai = nilai;
        this.tanggalUjian = tanggalUjian;
        this.status = "Belum Diatur"; 
    }

    public boolean statuskanKelulusan() {
        if (nilai >= 80) {
            status = "Lulus"; 
            return true;
        } else {
            status = "Tidak Lulus"; 
            return false;
        }
    }

    public void tampilkanInfo() {
        System.out.println("Jumlah Soal         : " + jumlahSoal);
        System.out.println("Nilai               : " + nilai);
        System.out.println("Status Kelulusan    : " + status); 
        System.out.println("Tanggal Ujian       : " + tanggalUjian);
    }
}
