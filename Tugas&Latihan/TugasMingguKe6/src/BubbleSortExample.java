/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class BubbleSortExample {
    static void bubbleSort(int[] arr){
      
    int n = arr.length;    
    int temp = 0;
    for (int i = 0; i < n; i++){
    
        for (int j = 1; j < (n-i); j++){
            //untuk melihat perbandingan
            System.out.println(" A : " + arr[j-1] + " > " + " B : " + arr[j]);
  
          if (arr[j-1] > arr[j]){
            
                //swab
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                }
            }
        }
    }


public static void main (String[] args){

    int arr[] = {3,60, 35, 45, 320};
    
    System.out.println("Array Before Bubble Sort : ");
    for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
        System.out.println();
        bubbleSort(arr); //sorting array element using bubble sort
        
        System.out.println("Array After Bubble Sort : ");
        
        for (int i = 0; i < arr.length; i ++){
            
            System.out.print(arr[i] + " ");
        }
    


    }

}//pblc
