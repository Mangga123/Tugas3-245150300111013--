class PengirimanBarang {
    private String namaPengirim;
    private String alamatTujuan;
    private double berat;
    private double biayaDasar;

    // Default Constructor
    public PengirimanBarang() {
        this.namaPengirim = "";
        this.alamatTujuan = "";
        this.berat = 0.0;
        this.biayaDasar = 0.0;
    }

    // Overloaded Constructor
    public PengirimanBarang(String namaPengirim, String alamatTujuan, double berat, double biayaDasar) {
        this.namaPengirim = namaPengirim;
        this.alamatTujuan = alamatTujuan;
        this.berat = berat;
        this.biayaDasar = biayaDasar;
    }

    // Overloaded Method: hitungOngkir dengan diskon persentase
    public double hitungOngkir(double diskonPersen) {
        return biayaDasar - (biayaDasar * diskonPersen / 100);
    }

    // Overloaded Method: hitungOngkir dengan diskon persentase dan biaya tambahan
    public double hitungOngkir(double diskonPersen, double biayaTambahan) {
        return (biayaDasar - (biayaDasar * diskonPersen / 100)) + biayaTambahan;
    }

    // Overloaded Method: hitungOngkir berdasarkan jarak
    public double hitungOngkir(int jarak) {
        if (jarak > 50) {
            return biayaDasar + (biayaDasar * 10 / 100); // Surcharge 10%
        } else {
            return biayaDasar - (biayaDasar * 5 / 100); // Diskon 5%
        }
    }

    // Method untuk menampilkan informasi pengiriman
    public void displayInfo() {
        System.out.println("Nama Pengirim: " + namaPengirim);
        System.out.println("Alamat Tujuan: " + alamatTujuan);
        System.out.println("Berat Barang: " + berat + " kg");
        System.out.println("Biaya Dasar: Rp " + biayaDasar);
    }

    // Method untuk menampilkan informasi logistik
    public static void displayInfoLogistik() {
        System.out.println("===== Informasi Perusahaan Logistik =====");
        System.out.println("Nama Perusahaan: FastShip Express");
        System.out.println("Layanan: Pengiriman Barang Cepat dan Aman");
        System.out.println("Website: www.fastshipexpress.com");
    }
}
