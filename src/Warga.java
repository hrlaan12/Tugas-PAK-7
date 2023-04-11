public class Warga {
    private String nama;
    private String alamat;
    private String metodePembayaran;

    // constructor
    public Warga(String nama, String alamat, String metodePembayaran) {
        this.nama = nama;
        this.alamat = alamat;
        this.metodePembayaran = metodePembayaran;
    }

    // getter and setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
}