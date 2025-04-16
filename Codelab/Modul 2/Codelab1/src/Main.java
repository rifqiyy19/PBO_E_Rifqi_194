class hewan {
    String nama;
    String jenis;
    String suara;

    hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    void tampilkaninfo() {
        System.out.println("Nama :" + nama);
        System.out.println("Jenis :"+ jenis);
        System.out.println("Suara :"+ suara);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        hewan hewan1;
        hewan1 = new hewan("Kucing","Mamalia","Nyan~~");
        hewan hewan2;
        hewan2 = new hewan("Anjing","Mamalia","Woof-Woof!!");

        hewan1.tampilkaninfo();
        hewan2.tampilkaninfo();
    }
}