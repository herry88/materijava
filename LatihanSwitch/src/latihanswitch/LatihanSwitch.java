/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanswitch;

import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class LatihanSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputUser;
        float a, b, hasil;        
        String operator;        
        
        inputUser = new Scanner(System.in);
        
        System.out.print("Nilai A = ");
        a = inputUser.nextFloat();
        System.out.print("Operator =  ");
        operator = inputUser.next();
        System.out.print("Nilai B = ");
        b = inputUser.nextFloat();
        
        switch (operator) {
            case "+":
                //penjumlahan 
                hasil = a + b;                
                System.out.print("Hasil adalah " + hasil);
                break;
            default:
                System.out.print("Tidak ada operator");
        }
        
    }
    
}
