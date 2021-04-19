/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_4;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class JavaApp_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean benar;
        
        //class untuk membaca inputan dari keyboard
        Scanner sc = new Scanner(System.in);
        System.out.print("Input variabel x :");
        int x = sc.nextInt();
        System.out.print("Input Variabel Y :");
        int y = sc.nextInt();
        
        //kondisi pernyataan 
        if(x < y ){
            System.out.println("x lebih kecil dari y");
            benar = true;
        } else{
            System.out.println("x lebih besar atau sama dengan dari y");
            benar = false;
        }
        
        if(benar)
            System.out.println("x Kecil, y Besar");
        else
            System.out.println("x Besar, y kecil");
        
        
        
    }
    
}
