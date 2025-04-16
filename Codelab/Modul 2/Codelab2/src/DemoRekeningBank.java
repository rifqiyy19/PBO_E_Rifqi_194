public class DemoRekeningBank {

    public static void main(String[] args) {
        // Membuat objek RekeningBank pertama dengan data yang diberikan
        RekeningBank rekening1 = new RekeningBank("202410370110194", "Muh. Rifqi Palettei", 500000.0);
        // Membuat objek RekeningBank kedua dengan data yang diberikan
        RekeningBank rekening2 = new RekeningBank("202410370110172", "Farrel Nadhif Otto D.", 1000000.0);

        // Menampilkan informasi awal rekening1
        rekening1.tampilkanInfo();
        // Menampilkan informasi awal rekening2
        rekening2.tampilkanInfo();

        // Melakukan penyetoran uang pada rekening1
        rekening1.setorUang(200000.0);
        // Melakukan penyetoran uang pada rekening2
        rekening2.setorUang(500000.0);

        System.out.println(); //Baris kosong untuk pemisah

        // Melakukan penarikan uang pada rekening1
        rekening1.tarikUang(800000.0);
        // Melakukan penarikan uang pada rekening2
        rekening2.tarikUang(300000.0);

        // Menampilkan informasi rekening1 setelah transaksi
        rekening1.tampilkanInfo();
        // Menampilkan informasi rekening2 setelah transaksi
        rekening2.tampilkanInfo();
    }
}

// Kelas RekeningBank untuk merepresentasikan rekening bank
class RekeningBank {
    // Atribut-atribut kelas
    private final String nomorRekening; // Nomor rekening (final, tidak dapat diubah setelah inisialisasi)
    private final String namaPemilik;   // Nama pemilik rekening (final, tidak dapat diubah setelah inisialisasi)
    private double saldo;               // Saldo rekening

    // Konstruktor untuk membuat objek RekeningBank
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();// Baris kosong untuk pemisah
    }

    // Method untuk menyetor uang ke rekening
    public void setorUang(double jumlah) {
        saldo += jumlah; // Menambahkan jumlah setoran ke saldo
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    // Method untuk menarik uang dari rekening
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) { // Memeriksa apakah saldo cukup
            saldo -= jumlah; // Mengurangi saldo dengan jumlah penarikan
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
            System.out.println();
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }
}