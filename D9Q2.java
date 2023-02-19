import java.util.Scanner;
import java.math.*;
public class D9Q2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double a=sc.nextDouble();
           Double b=sc.nextDouble();
           Double c=sc.nextDouble();
        
        if (a>=0 && b>=0 && c>=0 ){
            
            double s=(a+b+c)/2;
            System.out.println(s);
            double f;
        f=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            
            System.out.println(f);
        }
        else{
            System.out.println("Invalid");
        }
     
    }
}