public class Pembayaran {
    private float jumlahTotal;
    private String metodePembayaran;
    private Peserta peserta;

    public Pembayaran(Peserta peserta, float jumlahTotal, String metodePembayaran){ 
        this.peserta = peserta;
        this.jumlahTotal = jumlahTotal;
        this.metodePembayaran = metodePembayaran;
    }

    public void tampilkanPembayaran(){
        System.out.println("Total pembayaran: " + this.jumlahTotal);
        System.out.println("Metode pembayaran: " + this.metodePembayaran);
    }
}
