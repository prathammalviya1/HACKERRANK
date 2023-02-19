import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class D20Q1 {
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
        int []arr=new int[N];
        int i;
        if(N>2 && N<20){
            for (i=0;i<N; i++){
                arr[i]=sc.nextInt();
                  // System.out.print(arr[i]+" ");
            }
             System.out.print(arr[0]+" ");
            for (i=1;i<N;i++){
            if (arr[i]%2!=0 && arr[i-1]%2!=0){
                int avg=(arr[i]+arr[i-1])/2;
                System.out.print(avg+" "+arr[i]+" ");
            }
                else{
                    System.out.print(arr[i]+" ");
                }
            } 
        }
        else{
            System.out.println("Invalid Input");
        }
        
    }
}
