import java.util.Scanner;
public class D25Q2 {
    public static void main(String args[] )  {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int []arr=new int[10];
        int temp=0;
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    // System.out.print("\n");
                }
                
            }
                System.out.print(arr[i]+" ");
        }
//         for (int i = 0; i < arr.length; i++) {
        
//         }



    }
}
