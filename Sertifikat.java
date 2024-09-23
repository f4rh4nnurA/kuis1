public class Sertifikat {
    private String idSertifikat, tanggalTerbit;

    public Sertifikat(String idSertifikat, String tanggalTerbit) {
        this.idSertifikat = idSertifikat;
        this.tanggalTerbit = tanggalTerbit;
    }

    public void cetakSertifikat(int nilai){
        if (nilai < 80) {
            System.out.println("Nilai anda : " + nilai);
            System.out.println("Anda tidak lulus");
        } else{
            System.out.println("Nilai anda : " + nilai);
            System.out.println("Anda lulus");
            System.out.println("Anda mendapat sertifikat");
            System.out.println("Sertifikat ini dibuat pada : " + this.tanggalTerbit);
            System.out.println("ID Sertifikat : " + this.idSertifikat);
            
            
        }
    }
    
}
