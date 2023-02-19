import java.io.*;
import java.util.*;

public class D17Q1 {
    static int[] array;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        int nm=1;
        if(n>0){
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            
            array[i]=sc.nextInt();
            if(array[i]<0){
                nm=nm+1;
            }
        }
            if(nm==1){
        for(int i = 0; i<n; i++ ){
         for(int j = i+1; j<n; j++){

            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println(array[n-2]);}
        else{
            System.out.println("Invalid Array Elements");
        }}
        else{
            System.out.println("Invalid Array Size");
        }
    }
}