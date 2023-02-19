import java.util.Scanner;

public class D13Q1 {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        if(a>0 && b>0 && a!=b && a<b){
       for (int i=a;i<b;i++){
           sum+=i;
       }
        System.out.println(sum-1);
        }
        else{
            System.out.println("NO OUTPUT");        }
        
    }
}