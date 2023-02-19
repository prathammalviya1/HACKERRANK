import java.util.Scanner;
public class D2Q2{
    public static void main(String[] args){
     
        Scanner bh= new Scanner(System.in);
        float a=bh.nextFloat();
        float b=bh.nextFloat();
        float c=bh.nextFloat();
        float d=(a+b+c)/3;
        System.out.println((int)(d*10)/10.0);
    }
}