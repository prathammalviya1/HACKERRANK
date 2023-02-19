import java.io.*;
import java.util.*;

public class D22Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1 || n==2){
            if(n==1){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a+b);
            }
            if(n==2){
                String a=sc.next();
                String b=sc.next();
                System.out.println(a+b);
            }
        }
        else{
            System.out.println("ERROR");
        }
    }
}
