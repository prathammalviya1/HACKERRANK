import java.io.*;
import java.util.*;

public class D22Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1 || n==2){
            if(n==1){
            String a=sc.next();
            int b=sc.nextInt();
            while(b<0){
                b=sc.nextInt();
            }
            System.out.println(a+","+b);
        }
        if(n==2){
            System.out.println("null,0");
        }}
        else{
            System.out.println("Wrong Choice");
        }
    }
}
