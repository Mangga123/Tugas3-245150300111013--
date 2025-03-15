import java.util.Scanner;

public class MainPengiriman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan informasi logistik
        PengirimanBarang.displayInfoLogistik();
        System.out.println();

        // Input dari pengguna
        System.out.print("Masukkan Nama Pengirim: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Alamat Tujuan: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan Berat Barang (kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Masukkan Biaya Dasar Pengiriman: Rp ");
        double biayaDasar = scanner.nextDouble();

        // Instansiasi objek menggunakan input dari pengguna
        PengirimanBarang pengiriman = new PengirimanBarang(nama, alamat, berat, biayaDasar);
        pengiriman.displayInfo();

        // Menguji berbagai metode hitungOngkir
        System.out.print("Masukkan diskon persentase: ");
        double diskon = scanner.nextDouble();
        System.out.println("Ongkos Kirim setelah diskon " + diskon + "%: Rp " + pengiriman.hitungOngkir(diskon));

        System.out.print("Masukkan biaya tambahan: Rp ");
        double biayaTambahan = scanner.nextDouble();
        System.out.println("Ongkos Kirim setelah diskon " + diskon + "% + biaya tambahan: Rp " + pengiriman.hitungOngkir(diskon, biayaTambahan));

        System.out.print("Masukkan jarak pengiriman (km): ");
        int jarak = scanner.nextInt();
        System.out.println("Ongkos Kirim untuk jarak " + jarak + " km: Rp " + pengiriman.hitungOngkir(jarak));

        scanner.close();
    }
}
