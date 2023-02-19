import java.util.Scanner;
public class D2Q1{
    public static void main(String[] args){
       
        Scanner bh= new Scanner(System.in);
        int a=bh.nextInt();
        // int a=b/2;
        if(a==2 || a%2!=0 && a>=2 && a<=50){
            System.out.println("Prime Number");
        }
        else if(a%2==0 && a<=50 && a>0){
        System.out.println("Non Prime Number");
        }
    else if(a>50 && a>0){
        System.out.println("Number out of limit");
    }
    else if(a<0){
        System.out.println("Number should be Positive");
    }
    }
}