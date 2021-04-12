/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author ubuntu
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++ ){
            int index = i;
            
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                     index = j; 
                }
                
            }
            
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    
    public static int linierSearch(int[] arr, int key){
        for(int i =0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
            
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr1 = {9,14,23,2,3,43,11,58,22,40};
        System.out.println("Sebelum Di Selection Sort :");
//        System.out.println("Angka Berjumlah" + arr1.length);
        for(int i : arr1){
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(arr1);
        System.out.println("Setelah menggunakan selection sort");
        for(int i : arr1){
            System.out.print(i + " ");
        }
        
        int key = 2;
        System.out.println(key + "terdapat di index"+ " " + linierSearch(arr1, key));
    }
    
}
