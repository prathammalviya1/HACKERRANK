import java.io.*;
import java.util.*;

public class D11Q2 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
   
        String s2 = sc.nextLine();
        float c = sc.nextFloat();
        s1 = s1.replace("<br>" , "");
        s2 = s2.replace("<br>" , "");
        float a = Float.parseFloat(s1);
        float b = Float.parseFloat(s2);
        
        
        switch((int)b){
            case 1:
                if(c > a){
                    System.out.println("error");
                    return;
                }
                a = a-c - (a%1);
                System.out.format("%.2f", a);
                break;
            case 2:
                a = a+c;
                System.out.format("%.2f", a);
                break;
            case 3:
                System.out.format("%.2f", a);
                break;
            default:
                System.out.println("error");
                break;
        }
        
    }
}
