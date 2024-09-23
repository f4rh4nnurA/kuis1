class Registrasi {
    Peserta peserta;  
    String username;
    String password;

  
    public Registrasi(Peserta peserta, String username, String password) {
        this.peserta = peserta;
        this.username = username;
        this.password = password;
    }

  
    public void daftarkanPeserta() {
        System.out.println("Peserta " + peserta.getNamaPeserta() + " berhasil didaftarkan dengan username: " + username);
    }

   
    public Peserta getPeserta() {
        return peserta;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
