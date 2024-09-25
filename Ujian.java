public class Ujian {
    int jumlahSoal;
    int nilai;
    String status; // Pastikan ini diinisialisasi
    String tanggalUjian;

    public Ujian(int jumlahSoal, int nilai, String tanggalUjian, String tipeKonten, String idTipeKonten, String bahasa, String judul) {
        this.jumlahSoal = jumlahSoal;
        this.nilai = nilai;
        this.tanggalUjian = tanggalUjian;
        this.status = "Belum Diatur"; // Set status default saat objek dibuat
    }

    public boolean statuskanKelulusan() {
        if (nilai >= 80) {
            status = "Lulus"; // Jika nilai memenuhi syarat, set status menjadi "Lulus"
            return true;
        } else {
            status = "Tidak Lulus"; // Jika tidak memenuhi syarat, set status menjadi "Tidak Lulus"
            return false;
        }
    }

    public void tampilkanInfo() {
        System.out.println("Jumlah Soal         : " + jumlahSoal);
        System.out.println("Nilai               : " + nilai);
        System.out.println("Status Kelulusan    : " + status); // Pastikan status tampilkan di sini
        System.out.println("Tanggal Ujian       : " + tanggalUjian);
    }
}
