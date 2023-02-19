import java.util.Scanner;
public class D20Q2 {
    public static void main(String args[] )  {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
         int[] temp = new int[N];  
           int j = 0;  
        int []arr=new int [N];
        if(N>2 && N<30){
            for (int i=0; i<N;i++){
                arr[i]=sc.nextInt();
                   // System.out.print(arr[i]+" ");
                
            }
                    for (int i=0; i<N-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[N-1];     
     
        for (int i=0; i<j; i++){  
            arr[i] = temp[i]; 
                   System.out.print(temp[i]+" ");
        }   
        }
            else{
                System.out.println("Invalid Input");
            }
    }
}