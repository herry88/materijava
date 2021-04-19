/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

/**
 *
 * @author ubuntu
 */
public class JavaApps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hello World Java");
    int var1 = 50; 
    String var2 = "Herry Prasetyo ";
    double var3 = 0.2; 
    boolean var4 = true; 
    char var5 = 'A';
    int[] var6 = {1,2,3,4,5,6,7};
    
    System.out.println("Nama: " + var1);
    System.out.println("Angka : " + var2);
    System.out.println("Angka : " + var3);
    System.out.println("Value : " + var4);
    System.out.println("Char : " + var5);
    System.out.println("Array Pertama" + var6[0]);
    
        for(int i : var6){
            System.out.println(i + " ");
        }
    
    
    
    }
    
}
