import java.util.Scanner;

public class Lat1 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        
        String nama;
        String jurusan;
        String universitas;
        String hobi;

        System.out.print("Masukkan Nama Anda : "); 
        nama=scn.nextLine();
        System.out.print ("Masukkan Jurusan Anda : "); 
        jurusan=scn.nextLine ();
        System.out.print  ("Masukkan Universitas Anda     : "); 
        universitas=scn.nextLine ();
        System.out.print ("Masukkan Hobi Anda     : "); 
        hobi=scn.nextLine ();
        
        // Menampilkan Hasil Input
        System.out.println("Hallo nama saya adalah " + nama);
        System.out.println("Jurusan yang saya ambil adalah " + jurusan + " dari universitas " + universitas);
        System.out.println("Dan hobi saya adalah " + hobi + ".");

    }
    
}