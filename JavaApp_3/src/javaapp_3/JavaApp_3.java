/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_3;

/**
 *
 * @author ubuntu
 */
public class JavaApp_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // +, -, /, *
        //Deklarasikan terlebih dahulu variabelnya
        int a = 10; 
        int b = 5;
        int hasil;
        
        hasil = a + b;
        System.out.println("Hasil Penjumlahan " +  a  + " dan " + b  + " adalah :" + hasil);
        
        hasil = a * b;
        System.out.println("Hasil Perkaliannya adalah :" + hasil);
        
        
        //sisa bagi
        hasil = a % b;
        System.out.println(hasil);
       
        
    }
    
}
