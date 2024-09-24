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
        int noHp = sc.nextInt();
        sc.nextLine();

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
                    Kursus kursus1 = new Kursus("Pemrograman Java", "K001", "Teknologi", 500000, Duration.ofHours(10));
                    kursus1.tampilkanInfo();
                    System.out.println("============================");
                    System.out.println("Konten: ");
                    System.out.println("O Video:");
                    System.out.println("===============");
                    System.out.println("Video 1");
                    Video video1 = new Video("Video", "C002", "Indonesia", "Tutorial Java", "Inggris");
                    video1.tampilkanInfo();
                    System.out.println("===============");
                    System.out.println();
                    System.out.println("O Artikel:");
                    System.out.println("===============");
                    System.out.println("Artikel 1");
                    Artikel artikel1 = new Artikel("Artikel", "C001", "Indonesia", "Pemrograman Berorientasi Objek",
                            "Jane Smith",
                            "PDF");
                    artikel1.tampilkanInfo();
                    System.out.println("===============");

                    System.out.println();
                    System.out.println("============================");
                    System.out.println("2. Pemrograman C++");
                    Kursus kursus2 = new Kursus("Pemrograman C++", "K002", "Teknologi", 400000, Duration.ofHours(8));
                    kursus2.tampilkanInfo();
                    System.out.println("============================");
                    System.out.println("Konten: ");
                    System.out.println("O Video:");
                    System.out.println("===============");
                    System.out.println("Video 1");
                    Video video2 = new Video("Video", "C004", "Inggris", "Tutorial C++", "Indonesia");
                    video2.tampilkanInfo();
                    System.out.println("===============");
                    System.out.println();
                    System.out.println("O Artikel:");
                    System.out.println("===============");
                    System.out.println("Artikel 1");
                    Artikel artikel2 = new Artikel("Artikel", "C003", "Indonesia", "Pemrograman Website",
                            "Joe Mama",
                            "PDF");
                    artikel2.tampilkanInfo();
                    System.out.println("===============");
                    System.out.println("============================");
                    System.out.print("3. Bahasa Inggris");
                    Kursus kursus3 = new Kursus("Bahasa Inggris", "K003", "Bahasa", 200000, Duration.ofHours(12));
                    kursus3.tampilkanInfo();
                    System.out.println("============================");
                    System.out.println("Konten: ");
                    System.out.println("O Video:");
                    System.out.println("===============");
                    System.out.println("Video 1");
                    Video video3 = new Video("Video", "C006", "Indonesia", "Grammar", "Inggris");
                    video3.tampilkanInfo();
                    System.out.println("===============");
                    System.out.println();
                    System.out.println("O Artikel:");
                    System.out.println("===============");
                    System.out.println("Artikel 1");
                    Artikel artikel3 = new Artikel("Artikel", "C005", "Indonesia", "Cara Kerja Present Tense",
                            "John Smith",
                            "PDF");
                    artikel3.tampilkanInfo();
                    System.out.println("===============");
                    System.out.println("============================");
                    System.out.println("4. Bahasa Rusia");
                    Kursus kursus4 = new Kursus("Bahasa Rusia", "K004", "Bahasa", 300000, Duration.ofHours(8));
                    kursus4.tampilkanInfo();
                    System.out.println("============================");
                    System.out.println("Konten: ");
                    System.out.println("O Video:");
                    System.out.println("===============");
                    System.out.println("Video 1");
                    Video video4 = new Video("Video", "C008", "Rusia", "Bahasa Rusia", "Indonesia");
                    video4.tampilkanInfo();
                    System.out.println("===============");
                    System.out.println();
                    System.out.println("O Artikel:");
                    System.out.println("===============");
                    System.out.println("Artikel 1");
                    Artikel artikel4 = new Artikel("Artikel", "C007", "Indonesia", "Kata-kata Rusia",
                            "Putin Smith",
                            "PDF");
                    artikel4.tampilkanInfo();
                    System.out.println("===============");
                    System.out.println("============================");
                    System.out.println("5. Basis Data");
                    Kursus kursus5 = new Kursus("Basis Data", "K005", "Teknologi", 600000, Duration.ofHours(15));
                    kursus5.tampilkanInfo();
                    System.out.println("============================");
                    System.out.println("Konten: ");
                    System.out.println("O Video:");
                    System.out.println("===============");
                    System.out.println("Video 1");
                    Video video5 = new Video("Video", "C0010", "Inggris", "XML", "Inggris");
                    video5.tampilkanInfo();
                    System.out.println("===============");
                    System.out.println();
                    System.out.println("O Artikel:");
                    System.out.println("===============");
                    System.out.println("Artikel 1");
                    Artikel artikel5 = new Artikel("Artikel", "C009", "Indonesia", "Cara Kerja Basis Data",
                            "Jane Smith",
                            "PDF");
                    artikel5.tampilkanInfo();
                    System.out.println("===============");
                    System.out.println("============================");
                    System.out.println();

                    System.out.println("Pilih Kursus yang anda inginkan: ");
                    int pilihKursus = sc.nextInt();
                    switch (pilihKursus) {
                        case 1:
                            kursus1.tampilkanInfo();
                            System.out.println("Pilih Metode pembayaran(1/2): ");
                            System.out.println("1. Cash\n2. Debit");
                            int pilihPembayaran = sc.nextInt();

                            if (pilihPembayaran == 1) {
                                Pembayaran pembayaran1 = new Pembayaran(peserta1, 500000, "Cash");
                                pembayaran1.tampilkanPembayaran();
                            } else if (pilihPembayaran == 2) {
                                Pembayaran pembayaran1 = new Pembayaran(peserta1, 500000, "Kartu Kredit");
                                pembayaran1.tampilkanPembayaran();
                            } else {
                                System.out.println("Mohon Masukkan 1 Atau 2");
                            }
                            break;
                        case 2:
                            kursus2.tampilkanInfo();
                            System.out.println("Pilih Metode pembayaran(1/2): ");
                            System.out.println("1. Cash\n2. Debit");
                            int pilihPembayaran2 = sc.nextInt();
                            if (pilihPembayaran2 == 1) {
                                Pembayaran pembayaran2 = new Pembayaran(peserta1, 400000, "Cash");
                                pembayaran2.tampilkanPembayaran();
                            } else if (pilihPembayaran2 == 2) {
                                Pembayaran pembayaran2 = new Pembayaran(peserta1, 400000, "Kartu Kredit");
                                pembayaran2.tampilkanPembayaran();
                            } else {
                                System.out.println("Mohon Masukkan 1 Atau 2");
                            }

                            break;
                        case 3:
                            kursus3.tampilkanInfo();
                            System.out.println("Pilih Metode pembayaran(1/2): ");
                            System.out.println("1. Cash\n2. Debit");
                            int pilihPembayaran3 = sc.nextInt();
                            if (pilihPembayaran3 == 1) {
                                Pembayaran pembayaran3 = new Pembayaran(peserta1, 200000, "Cash");
                                pembayaran3.tampilkanPembayaran();
                            } else if (pilihPembayaran3 == 2) {
                                Pembayaran pembayaran3 = new Pembayaran(peserta1, 200000, "Kartu Kredit");
                                pembayaran3.tampilkanPembayaran();
                            } else {
                                System.out.println("Mohon Masukkan 1 Atau 2");
                            }

                            break;
                        case 4:
                            kursus4.tampilkanInfo();
                            System.out.println("Pilih Metode pembayaran(1/2): ");
                            System.out.println("1. Cash\n2. Debit");
                            int pilihPembayaran4 = sc.nextInt();
                            if (pilihPembayaran4 == 1) {
                                Pembayaran pembayaran4 = new Pembayaran(peserta1, 300000, "Cash");
                                pembayaran4.tampilkanPembayaran();
                            } else if (pilihPembayaran4 == 2) {
                                Pembayaran pembayaran4 = new Pembayaran(peserta1, 300000, "Kartu Kredit");
                                pembayaran4.tampilkanPembayaran();
                            } else {
                                System.out.println("Mohon Masukkan 1 Atau 2");
                            }

                            break;
                        case 5:
                            kursus5.tampilkanInfo();
                            System.out.println("Pilih Metode pembayaran(1/2): ");
                            System.out.println("1. Cash\n2. Debit");
                            int pilihPembayaran5 = sc.nextInt();
                            if (pilihPembayaran5 == 1) {
                                Pembayaran pembayaran5 = new Pembayaran(peserta1, 600000, "Cash");
                                pembayaran5.tampilkanPembayaran();
                            } else if (pilihPembayaran5 == 2) {
                                Pembayaran pembayaran5 = new Pembayaran(peserta1, 600000, "Kartu Kredit");
                                pembayaran5.tampilkanPembayaran();
                            } else {
                                System.out.println("Mohon Masukkan 1 Atau 2");
                            }
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                            break;
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
                    Instruktur instruktur4 = new Instruktur("Joe Mama", "I003", "Perempuan", "Pemrograman");
                    instruktur4.getInstruktur();

                    System.out.println("===========================================================================");

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
