import java.util.Scanner;
public class D6Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float temp=sc.nextFloat();
        if (temp>=95 && temp<=105){
            float convert=((temp-32)*5)/9;
         System.out.println((int)(convert*10)/10.0);
        }
        else{
            System.out.println("Invalid");
        }
    }
}