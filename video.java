import java.time.Duration;

public class Video extends Konten {
    private String bahasaSubtitle;
    private boolean isPaused;
    private boolean isPlaying;
    private Duration waktuSekarang;

    public Video(String tipeKonten, String idTipeKonten, String bahasa, String judul, String bahasaSubtitle) {
        super(tipeKonten, idTipeKonten, bahasa, judul);  
        this.bahasaSubtitle = bahasaSubtitle;
        this.isPaused = false;
        this.isPlaying = false;
        this.waktuSekarang = Duration.ZERO; 
    }

    public void reversePlayBack(Duration mundur) {
        if (isPlaying && !isPaused) {
            waktuSekarang = waktuSekarang.minus(mundur);
            if (waktuSekarang.isNegative()) {
                waktuSekarang = Duration.ZERO;
            }
            System.out.println("Waktu video setelah dimundurkan: " + formatWaktuSekarang());
        } else {
            System.out.println("Video tidak sedang dimainkan.");
        }
    }

    public void hidupkanSubtitle() {
        System.out.println("Subtitle dihidupkan: " + bahasaSubtitle);
    }

    public void matikanSubtitle() {
        System.out.println("Subtitle dimatikan.");
    }

    public void ubahSubtitle(String bedaSubtitle) {
        this.bahasaSubtitle = bedaSubtitle;
        System.out.println("Subtitle diubah menjadi: " + bedaSubtitle);
    }

    public void mainkanVideo() {
        if (!isPlaying) {
            isPlaying = true;
            isPaused = false;
            System.out.println("Video dimainkan.");
        }
    }

    public void matikanVideo() {
        isPlaying = false;
        isPaused = false;
        waktuSekarang = Duration.ZERO;
        System.out.println("Video dimatikan.");
    }

    public void pauseVideo() {
        if (isPlaying) {
            isPaused = true;
            isPlaying = false;
            System.out.println("Video di-pause pada waktu: " + formatWaktuSekarang());
        }
    }

    public void hentikanVideo() {
        isPlaying = false;
        isPaused = false;
        waktuSekarang = Duration.ZERO;
        System.out.println("Video dihentikan.");
    }

    public void cepatkanVideo(Duration cepat) {
        if (isPlaying && !isPaused) {
            waktuSekarang = waktuSekarang.plus(cepat);
            System.out.println("Waktu video setelah dipercepat: " + formatWaktuSekarang());
        } else {
            System.out.println("Video tidak sedang dimainkan.");
        }
    }

    public void tampilkanWaktuSekarang() {
        System.out.println("Waktu saat ini: " + formatWaktuSekarang());
    }

    private String formatWaktuSekarang() {
        long jam = waktuSekarang.toHours();
        long menit = waktuSekarang.toMinutesPart();
        long detik = waktuSekarang.toSecondsPart();
        return String.format("%02d:%02d:%02d", jam, menit, detik);
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();  
        System.out.println("Bahasa Subtitle: " + bahasaSubtitle);
        System.out.println("Status: " + (isPlaying ? "Sedang dimainkan" : "Tidak dimainkan"));
        System.out.println("Waktu Saat Ini: " + formatWaktuSekarang());
    }
}
