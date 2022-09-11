import java.util.Scanner;
import java.util.Random;


public class Ramalan {
    public static void main(String[] args) {
        String nmKamu;
        String nmPasangan;
        int umurKamu, umurPasangan;


        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Selamat Datang Di Program Ramalan Cupu ");
        System.out.println(" +++++++++++++++++++++++++++++ ");
        System.out.println('\n');

        System.out.println(" Data Anda  ");
        System.out.println(" ************ ");
        System.out.print(" Masukan Nama Anda : ");
        nmKamu = keyboard.nextLine();
        System.out.print(" Masukan Umur Anda: ");
        umurKamu = keyboard.nextInt();
        System.out.println('\n');


        System.out.println(" Data Pasangan Anda ");
        System.out.println(" ********************* ");
        System.out.print(" Masukan Nama Pasangan Anda: ");
        nmPasangan = keyboard.next();
        System.out.print(" Masukan Umur Pasangan Anda: ");
        umurPasangan = keyboard.nextInt();
        System.out.println('\n');


        System.out.println(  nmKamu + " " + umurKamu + " " + "tahun");
        System.out.println(" \n ");
        System.out.println("   LOVE ");
        System.out.println(" \n ");
        System.out.println(  nmPasangan + " " + umurPasangan + " " + "tahun");
        System.out.println('\n');


        Random hitung = new Random();
        int angka = hitung.nextInt(50) + 50;
        System.out.println(String.format(" Kecocokan Anda dengan pasangan adalah %.2f", angka / 1.1));
        System.out.println('\n');


        System.out.println(" Terimakasih Telah Menggunakan Jasa Ramalan Kami.. ^^v ");
    }
}