
import java.util.Scanner;

public class D4Q1{

    public static void main(String[] args) {
int flag=0;
    Scanner bh=new Scanner(System.in);
            float N=bh.nextFloat();
    float K=bh.nextFloat();
    if(N%K==0){
           System.out.println("Multiple");
           flag=1;
           
    }
   
        if(flag==0){
            System.out.println("Not Multiple");
        }
    }
}