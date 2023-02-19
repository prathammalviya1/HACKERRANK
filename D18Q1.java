import java.util.Scanner;

public class D18Q1 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int []arr=new int[6];
        int min=1000000;
        int max=0;
        int a=0;
        int b=0;
        for (int i=0; i<6; i++){
            arr[i]=s.nextInt();
            if(arr[i]>max){
                max=arr[i];
                a=i;
            }
            if(arr[i]<min){
                min=arr[i];
                b=i;
            }
        }
        for (int i=0; i<6;i++){
            if(i==a){
                arr[i]=min;
              
            }}
            
              for (int i=0; i<6;i++){
           
                
                  System.out.print(arr[i]+" ");
            
              }
        
        
        
    }
}