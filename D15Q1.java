import java.io.*;
import java.util.*;
public class D15Q1 {
    
    public static void main(String[] args) {
        int a,count,count1,count2,count3;
        int twoth=2000;
        int five=500;
        int two=200;
        int one=100;
        Scanner s=new Scanner(System.in);
        a = s.nextInt();
        if(a>=100 && a<=20000 && a%100==0)
        {
            if(a>=2000)
            {
               count=(int) a/twoth;
                
                int t=(int) a%twoth;
                if(t>=500)
                {
                    int c=(int) t/five;
                    int t1=(int) t%five;
                    
                    if(t1>=200)
                    {
                        int c1=(int) t1/two;
                        int t2=(int) t1%two;
                        if(t2>=100)
                        {
                            int c2=(int) t2/one;
                            System.out.println(c2+" "+one+" Notes");
                            
                        }
                        System.out.println(c1+" "+two+" Notes");
                    }
                    System.out.println(c+" "+five+" Notes");
                }
                else if(t>=200)
                {
                    int c1=(int) t/two;
                        int t2=(int) t%two;
                        if(t2>=100)
                        {
                            int c2=(int) t2/one;
                            System.out.println(c2+" "+one+" Notes");
                            
                        }
                    System.out.println(c1+" "+two+" Notes");
                }
                else if(t>=100)
                {
                   
                            int c2=(int) t/one;
                            System.out.println(c2+" "+one+" Notes"); 
                }
                System.out.println(count+" "+twoth+" Notes");
            }
            else if(a>=500)
            {
                count1=(int) a/five;
                int t1=a%500;
                
                    if(t1>=200)
                    {
                        int c1=(int) t1/two;
                        int t2=(int) t1%two;
                        if(t2>=100)
                        {
                            int c2=(int) t2/one;
                            System.out.println(c2+" "+one+" Notes");
                            
                        }
                        System.out.println(c1+" "+two+" Notes");
                    }
                    else if(t1>=100)
                        {
                            int c2=(int) t1/one;
                            System.out.println(c2+" "+one+" Notes");
                            
                        }
                System.out.println(count1+" "+five+" Notes");
                
                
            }
            else if(a>=200)
            {
                count2=(int) a/two;
                int t2=(int) a%two;
                        if(t2>=100)
                        {
                            int c2=(int) t2/one;
                            System.out.println(c2+" "+one+" Notes");
                            
                        }
                System.out.println(count2+" "+two+" Notes");
                
            }
            else if(a>=100)
            {
                count3=(int) a/one;
                System.out.println(count3+" "+one+" Notes");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
      
    }
}
