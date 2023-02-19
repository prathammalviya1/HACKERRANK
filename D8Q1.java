import java.util.Scanner;
public class D8Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int temp=0;
        if(num1>=0 && num1<=127 && num2>=0 && num2<=127) {
            for (int i = 0; i < num1; i++) {
                if (num1 << i == num2) {
                    System.out.println("Yes");
                    temp++;
                }
            }
                if(temp==0) {
                    System.out.println("No");
                }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}