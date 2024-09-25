class Login {
    Registrasi dataRegistrasi;

    public Login(Registrasi dataRegistrasi) {
        this.dataRegistrasi = dataRegistrasi;
    }

    public boolean autentikasi(String inputUsername, String inputPassword) {
        if (inputUsername.equals(dataRegistrasi.getUsername()) && inputPassword.equals(dataRegistrasi.getPassword())) {
            System.out.println("Login berhasil! Selamat datang, " + dataRegistrasi.getPeserta().getNama());
            return true;
        } else {
            System.out.println("Login gagal! Username atau password salah.");
            return false;
        }
    }
}