import java.io.*;
import java.util.*;

public class D23Q2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        boolean isBigger=false;
        if (num1>10 && num1<1000 && num2>10 && num2<1000){
        if(num1>num2){
             System.out.println("true");
            
              
        }
            else{
                System.out.println(isBigger);
            }
        }
        else{
            System.out.println("Invalid Input");
            }
    }
}
