import java.util.Scanner;

public class D19Q1 {

    public static void main(String[] args) {
        int Sum=0;
         int temp=0;
        Scanner sc=new Scanner(System.in); 
        // int n=sc.nextInt ();
        int arr[]=new int [10];
        int i,j;
       
        for (i=0; i<10; i++){
        arr[i]=sc.nextInt();
            // System.out.println(arr[i]);
        }
        for (i=0;i<10;i++){
        for (j=i+1;j<arr.length;j++){
            if (arr[j]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        for (i=1;i<9;i++){
            Sum+=arr[i];
            
        }
                System.out.println(Sum);
            // }
    }
}