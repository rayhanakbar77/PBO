/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javakalkulator;
import java.util.Scanner;
/**
 *
 * @author akbar
 */
public class Javakalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka 1: ");
        double bil1 = scanner.nextDouble();

        System.out.print("Masukkan angka 2: ");
        double bil2 = scanner.nextDouble();

        System.out.print("Pilih operasi (+, -, *, /, mod): ");
        String operasi = scanner.next();

        double hasil = 0;
        switch (operasi) {
            case "+":
                hasil = bil1 + bil2;
                break;
            case "-":
                hasil = bil1 - bil2;
                break;
            case "*":
                hasil = bil1 * bil2;
                break;
            case "/":
                if (bil2 == 0) {
                    System.out.println("Pembagian dengan 0 tidak diizinkan!");
                } else {
                    hasil = bil1 / bil2;
                }
                break;
            case "mod":
                hasil = bil1 % bil2;
                break;
            default:
                System.out.println("Operasi tidak valid!");
        }

        System.out.println("Hasil: " + hasil);
    }
}