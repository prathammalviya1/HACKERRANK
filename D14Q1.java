import java.util.Scanner;
public class D14Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>0){
        for (int i=num;i>=1;i--){
           for (int j=1;j<=i;j++) {
               System.out.print(j+" ");
//               System.out.println(i);
           }
           System.out.print("\n");
        }
        }
        else{
            System.out.println("Invalid Rows");
        }
    }
}
