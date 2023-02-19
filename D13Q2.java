import java.util.Scanner;
public class D13Q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
        for(int i=n; i>0; i--){
            for (int j=i;j>0;j-- ){
                System.out.print("@");
            }
            System.out.print("\n");
        }
        }
        else{
            System.out.println("Invalid Rows");
        }
    }
}
