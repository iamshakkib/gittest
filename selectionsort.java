import java.util.*;
import java.io.*;

class SelectionSortExample {  
        public static void selectionSort(int[] arr){  
            for (int i = 0; i < arr.length - 1; i++)  
            {  
                int index = i;  
                for (int j = i + 1; j < arr.length; j++){  
                    if (arr[j] < arr[index]){  
                        index = j;//searching for lowest index  
                    }  
                }  
                int smallerNumber = arr[index];   
                arr[index] = arr[i];  
                arr[i] = smallerNumber;  
            }  
        }  
           
        public static void main(String args[]){  
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
            	arr[i]=sc.nextInt();
            } 
            System.out.println("Before Selection Sort");  
            for(int i:arr){  
                System.out.print(i+" ");  
            }  
            System.out.println();  
              
            selectionSort(arr);//sorting array using selection sort  
             
            System.out.println("After Selection Sort");  
            for(int i:arr){  
                System.out.print(i+" ");  
            }  
        }  
    }  
