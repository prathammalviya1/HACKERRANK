import java.util.Scanner;
public class D9Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter two digit number: ");
        int num=sc.nextInt();
        int a=num/10;
        int b=num%10;
        int sum=a+b;
        int mul=a*b;

        if(num>9 && num<100) {
            if(num==(sum+mul)){
                    System.out.println("special two digit number");
                }
        else{
            System.out.println("not a special two digit number");
            }

        }
        else{
            System.out.println("invalid input");
        }
    }
}