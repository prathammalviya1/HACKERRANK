import java.util.Scanner;
public class D6Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float temp=sc.nextFloat();
        if (temp>=30 && temp<=45){
            float convert=(9*temp)/5+32;
            System.out.printf("%.1f",convert);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}