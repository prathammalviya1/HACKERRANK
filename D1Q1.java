import java.util.Scanner;
public class D1Q1 {
    public static void main(String[] args){
    
        Scanner bh= new Scanner (System.in);
        int a=bh.nextInt();
        int b=bh.nextInt();
        int c=bh.nextInt();
        if(a>=0 && b>=0 && c>=0){
             System.out.println(a+"*"+b+"*"+c);
        }
        else{
         System.out.println("Invalid Input");
        }
       
    }
}
