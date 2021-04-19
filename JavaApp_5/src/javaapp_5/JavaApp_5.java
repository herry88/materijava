/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ubuntu
 */
public class JavaApp_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan sangat sederhana");
        int value = 0; 
        int anotherValue = 0; 
        try{
            System.out.println("Masukkan Angka Pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukkan Angka Kedua :");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
            
        }catch(IOException e){
            e.printStackTrace();
        }
        int result = value + anotherValue; 
        System.out.println("Hasilnya Adalah =" + " " + result );
    }
    
}
