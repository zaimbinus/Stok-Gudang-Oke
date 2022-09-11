import java.util.Scanner;

public class Stok_Gudang_Oke {

    public static void main(String[] args) {

        String Nama,Nama_Barang;
        int Jumlah_Barang;
        Double Harga_Beli, Harga_Jual;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda : ");
        Nama = input.nextLine();
        System.out.println("Stok Gudang Input Barang");
        System.out.println("################################");
        System.out.println("Selamat datang " + Nama);
        System.out.print("Masukkan nama barang yang mau ditambah : ");
        Nama_Barang = input.nextLine();
        System.out.print("Masukkan jumlah barang yang mau ditambah : ");
        Jumlah_Barang = input.nextInt();
        System.out.print("Masukkan harga beli untuk barang tersebut : ");
        Harga_Beli = input.nextDouble();
        System.out.print("Masukkan harga jual untuk barang tersebut : ");
        Harga_Jual = input.nextDouble();

        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("#########################");
        System.out.println("Nama Barang : " + Nama_Barang);
        System.out.println("Jumlah Barang : " + Jumlah_Barang);
        System.out.printf("Harga Beli : Rp. " + "%.2f\n", Harga_Beli);
        System.out.printf("Harga Jual : Rp. " + "%.2f\n", Harga_Jual);
    }
}