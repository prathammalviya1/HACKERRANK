import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class D21Q2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>1){
                
        DecimalFormat df = new DecimalFormat("#.####");
        for(int i=0;i<n;i++)
        {
            double r=s.nextDouble();
            
            if(r<0)
            {
                continue;
            }
            double area=(3.14*r*r);
            if(area>30.0)
            {
                System.out.println(df.format(area));
            }
        }
    }
        else
        {
            System.out.println("Invalid input");
        }
    }
}