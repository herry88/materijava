/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps_6;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class JavaApps_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char nilai;
        Scanner input = new Scanner(System.in);

        System.out.print("Input Nilai Anda (A - E): ");
        nilai = input.next(".").charAt(0);
        switch (nilai) {
            case 'A':
                System.out.println("Pertahankan!");
                break;
            case 'B':
                System.out.println("Harus lebih baik lagi");
                break;
            case 'C':
                System.out.println("Perbanyak belajar");
                break;
            case 'D':
                System.out.println("Jangan keseringan main");
                break;
            case 'E':
                System.out.println("Kebanyakan bolos...");
                break;
            default:
                System.out.println("Maaf, format nilai tidak sesuai");
        }

        
    }

}
