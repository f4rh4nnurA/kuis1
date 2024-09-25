import java.time.Duration;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat datang di Aplikasi Kursus!");
        System.out.println("Silahkan daftarkan diri anda!");

        System.out.println("===========================================================================");

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = sc.nextLine();
        System.out.print("Masukkan nomor telepon: ");
        long noHp = sc.nextLong();
        sc.nextLine(); // Clear buffer

        Peserta peserta1 = new Peserta(nama, "P001", alamat, noHp);

        System.out.println("===========================================================================");

        System.out.print("Masukkan Username: ");
        String username = sc.nextLine();
        System.out.print("Masukkan Password: ");
        String password = sc.nextLine();

        System.out.println("===========================================================================");

        Registrasi registrasi1 = new Registrasi(peserta1, username, password);
        registrasi1.daftarkanPeserta();
        peserta1.tampilkanPeserta();

        System.out.println("===========================================================================");

        Login login1 = new Login(registrasi1);
        boolean loginSukses = false;
        while (!loginSukses) {
            System.out.print("Masukkan username: ");
            String inputUsername = sc.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = sc.nextLine();
            System.out.println("===========================================================================");
            loginSukses = login1.autentikasi(inputUsername, inputPassword);
        }

        System.out.println("===========================================================================");

        while (true) {

            System.out.print("Silahkan pilih apa yang anda inginkan: ");
            System.out.println();
            System.out.println("1. Daftar Kursus");
            System.out.println("2. Daftar Instruktur");
            System.out.println("3. Keluar");
            int opsi = sc.nextInt();

            switch (opsi) {
                case 1:
                    System.out.println("Kursus:");
                    System.out.println("1. Pemrograman Java");
                    System.out.println("2. Pemrograman C++");
                    System.out.println("3. Bahasa Inggris");
                    System.out.println("4. Bahasa Rusia");
                    System.out.println("5. Basis Data");

                    System.out.println("============================");
                    System.out.print("Pilih Kursus yang anda inginkan: ");
                    int pilihKursus = sc.nextInt();

                    Kursus kursusDipilih = null;
                    Video videoDipilih = null;
                    Artikel artikelDipilih = null;
                    Ujian ujianDipilih = null;

                    switch (pilihKursus) {
                        case 1:
                            kursusDipilih = new Kursus("Pemrograman Java", "K001", "Teknologi", 500000, Duration.ofHours(10));
                            videoDipilih = new Video("Video", "C001", "Indonesia", "Tutorial Java", "Inggris");
                            artikelDipilih = new Artikel("Artikel", "C002", "Indonesia", "Pemrograman Berorientasi Objek", "Jane Smith", "PDF");
                            ujianDipilih = new Ujian(50, 85, "2024-09-25", "Ujian", "U001", "Indonesia", "Ujian Pemrograman Java");
                            break;
                        case 2:
                            kursusDipilih = new Kursus("Pemrograman C++", "K002", "Teknologi", 400000, Duration.ofHours(8));
                            videoDipilih = new Video("Video", "C003", "Indonesia", "Tutorial C++", "Indonesia");
                            artikelDipilih = new Artikel("Artikel", "C004", "Indonesia", "Pemrograman Website", "Joe Mama", "PDF");
                            ujianDipilih = new Ujian(40, 70, "2024-09-26", "Ujian", "U002", "Indonesia", "Ujian Pemrograman C++");
                            break;
                        case 3:
                            kursusDipilih = new Kursus("Bahasa Inggris", "K003", "Bahasa", 200000, Duration.ofHours(12));
                            videoDipilih = new Video("Video", "C005", "Indonesia", "Grammar", "Inggris");
                            artikelDipilih = new Artikel("Artikel", "C006", "Indonesia", "Cara Kerja Present Tense", "John Smith", "PDF");
                            ujianDipilih = new Ujian(60, 90, "2024-09-27", "Ujian", "U003", "Indonesia", "Ujian Bahasa Inggris");
                            break;
                        case 4:
                            kursusDipilih = new Kursus("Bahasa Rusia", "K004", "Bahasa", 300000, Duration.ofHours(8));
                            videoDipilih = new Video("Video", "C007", "Rusia", "Bahasa Rusia", "Indonesia");
                            artikelDipilih = new Artikel("Artikel", "C008", "Indonesia", "Kata-kata Rusia", "Putin Smith", "PDF");
                            ujianDipilih = new Ujian(30, 95, "2024-09-28", "Ujian", "U004", "Rusia", "Ujian Bahasa Rusia");
                            break;
                        case 5:
                            kursusDipilih = new Kursus("Basis Data", "K005", "Teknologi", 600000, Duration.ofHours(15));
                            videoDipilih = new Video("Video", "C009", "Inggris", "XML", "Inggris");
                            artikelDipilih = new Artikel("Artikel", "C010", "Indonesia", "Cara Kerja Basis Data", "Jane Smith", "PDF");
                            ujianDipilih = new Ujian(45, 65, "2024-09-29", "Ujian", "U005", "Indonesia", "Ujian Basis Data");
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                            continue;
                    }

                    kursusDipilih.tampilkanInfo();

                    // Pembayaran kursus
                    System.out.println("Pilih Metode pembayaran(1/2): ");
                    System.out.println("1. Cash\n2. Debit");
                    int pilihPembayaran = sc.nextInt();
                    if (pilihPembayaran == 1) {
                        Pembayaran pembayaran = new Pembayaran(peserta1, kursusDipilih.getHarga(), "Cash");
                        pembayaran.tampilkanPembayaran();
                    } else if (pilihPembayaran == 2) {
                        Pembayaran pembayaran = new Pembayaran(peserta1, kursusDipilih.getHarga(), "Kartu Kredit");
                        pembayaran.tampilkanPembayaran();
                    } else {
                        System.out.println("Mohon Masukkan 1 Atau 2");
                        continue;
                    }

                    // Setelah Pembayaran: Pilih Konten
                    boolean selesaiKonten = false;
                    while (!selesaiKonten) {
                        System.out.println("Pilih Konten:");
                        System.out.println("1. Video");
                        System.out.println("2. Artikel");
                        System.out.println("3. Ujian");
                        System.out.println("4. Keluar dari Kursus");
                        int pilihKonten = sc.nextInt();

                        switch (pilihKonten) {
                            case 1:
                                // Kontrol Video
                                boolean selesaiVideo = false;
                                while (!selesaiVideo) {
                                    System.out.println("Kontrol Video:");
                                    System.out.println("1. Mainkan Video");
                                    System.out.println("2. Pause Video");
                                    System.out.println("3. Stop Video");
                                    System.out.println("4. Percepat Video");
                                    System.out.println("5. Mundurkan Video");
                                    System.out.println("6. Tampilkan Waktu Sekarang");
                                    System.out.println("7. Hidupkan Subtitle");
                                    System.out.println("8. Matikan Subtitle");
                                    System.out.println("9. Ubah Subtitle");
                                    System.out.println("10. Selesai Video");
                                    int aksiVideo = sc.nextInt();

                                    switch (aksiVideo) {
                                        case 1:
                                            videoDipilih.mainkanVideo();
                                            break;
                                        case 2:
                                            videoDipilih.pauseVideo();
                                            break;
                                        case 3:
                                            videoDipilih.hentikanVideo();
                                            break;
                                        case 4:
                                            System.out.print("Masukkan durasi percepat (dalam detik): ");
                                            long detikCepat = sc.nextLong();
                                            videoDipilih.cepatkanVideo(Duration.ofSeconds(detikCepat));
                                            break;
                                        case 5:
                                            System.out.print("Masukkan durasi mundurkan (dalam detik): ");
                                            long detikMundur = sc.nextLong();
                                            videoDipilih.reversePlayBack(Duration.ofSeconds(detikMundur));
                                            break;
                                        case 6:
                                            videoDipilih.tampilkanWaktuSekarang();
                                            break;
                                        case 7:
                                            videoDipilih.hidupkanSubtitle();
                                            break;
                                        case 8:
                                            videoDipilih.matikanSubtitle();
                                            break;
                                        case 9:
                                            sc.nextLine(); // Clear buffer
                                            System.out.print("Masukkan subtitle baru: ");
                                            String subtitleBaru = sc.nextLine();
                                            videoDipilih.ubahSubtitle(subtitleBaru);
                                            break;
                                        case 10:
                                            selesaiVideo = true;
                                            break;
                                        default:
                                            System.out.println("Aksi tidak valid.");
                                            break;
                                    }
                                }
                                break;

                            case 2:
                                // Manipulasi Artikel
                                boolean selesaiArtikel = false;
                                while (!selesaiArtikel) {
                                    System.out.println("Kontrol Artikel:");
                                    System.out.println("1. Tambahkan Komentar");
                                    System.out.println("2. Hapus Komentar");
                                    System.out.println("3. Tampilkan Artikel");
                                    System.out.println("4. Selesai Artikel");
                                    int aksiArtikel = sc.nextInt();
                                    sc.nextLine(); // Clear buffer

                                    switch (aksiArtikel) {
                                        case 1:
                                            System.out.print("Masukkan komentar: ");
                                            String komentar = sc.nextLine();
                                            artikelDipilih.addKomentar(komentar);
                                            break;
                                        case 2:
                                            artikelDipilih.hapusKomentar();
                                            break;
                                        case 3:
                                            artikelDipilih.tampilkanInfo();
                                            break;
                                        case 4:
                                            selesaiArtikel = true;
                                            break;
                                        default:
                                            System.out.println("Aksi tidak valid.");
                                            break;
                                    }
                                }
                                break;

                            case 3:
                                // Ujian
                                System.out.println("Memulai Ujian...");
                                ujianDipilih.statuskanKelulusan();  // Memastikan status di-set sebelum ditampilkan
                                ujianDipilih.tampilkanInfo(); // Tampilkan info setelah status di-set
                                boolean lulus = ujianDipilih.statuskanKelulusan();
                                if (lulus) {
                                    System.out.println("Selamat, Anda lulus ujian!");
                                    Sertifikat sertifikat = new Sertifikat("S001", "2024-09-26");
                                    sertifikat.cetakSertifikat(ujianDipilih.nilai);
                                } else {
                                    System.out.println("Maaf, Anda tidak lulus ujian.");
                                }
                                break;

                            case 4:
                                selesaiKonten = true;
                                break;

                            default:
                                System.out.println("Aksi tidak valid.");
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("===========================================================================");
                    System.out.println("Instruktur 1");
                    Instruktur instruktur1 = new Instruktur("Jane Smith", "I001", "Perempuan", "Pemrograman");
                    instruktur1.getInstruktur();
                    System.out.println("===========================");
                    System.out.println("Instruktur 2");
                    Instruktur instruktur2 = new Instruktur("Putin", "I002", "Laki-Laki", "Bahasa Rusia");
                    instruktur2.getInstruktur();
                    System.out.println("===========================");
                    System.out.println("Instruktur 3");
                    Instruktur instruktur3 = new Instruktur("John Smith", "I003", "Perempuan", "Bahasa Inggris");
                    instruktur3.getInstruktur();
                    System.out.println("===========================");
                    System.out.println("Instruktur 4");
                    Instruktur instruktur4 = new Instruktur("Joe Mama", "I004", "Perempuan", "Pemrograman");
                    instruktur4.getInstruktur();
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Silahkan masukkan antara 1-3");
                    break;
            }
        }
    }
}
