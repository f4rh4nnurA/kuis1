class Ujian {
    int jumlahSoal;
    int nilai;
    String status;
    String tanggalUjian;


    public Ujian(int jumlahSoal, int nilai, String tanggalUjian) {
        this.jumlahSoal = jumlahSoal;
        this.nilai = nilai;
        this.tanggalUjian = tanggalUjian;
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

    public void tampilkanInfoUjian() {
        System.out.println("Jumlah Soal         : " + jumlahSoal);
        System.out.println("Nilai                : " + nilai);
        System.out.println("Status Kelulusan    : " + status);
    }
}