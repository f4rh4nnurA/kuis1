public class Peserta {
    private String namaPeserta, idPeserta, alamat;
    private long nomorTelepon;

    public Peserta(String namaPeserta, String idPeserta, String alamat, long nomorTelepon) {
        this.namaPeserta = namaPeserta;
        this.idPeserta = idPeserta;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return this.namaPeserta;
    }

    public String getID() {
        return this.idPeserta;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public long getTelepon() {
        return this.nomorTelepon;
    }

    public void tampilkanPeserta() {
        System.out.println("Peserta : " + this.namaPeserta);
        System.out.println("ID Peserta : " + this.idPeserta);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Nomor Telepon : " + this.nomorTelepon);
    }

}
