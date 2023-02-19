
import java.util.Scanner;

public class D16Q2 {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();

        int min = 100000;  
        
              
      if(n<0){  
          System.out.println("Invalid Array Size");
      }
        else{
            int []arr=new int[n];
           
        for (int i: arr){
            arr[i]=sc.nextInt();
               if(arr[i] < min) 
               {
               min = arr[i];  
               }
          
        }  
               System.out.print(min);
      }
        
                
        
        }
        
    }
