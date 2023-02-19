import java.io.*;
import java.util.*;

public class D15Q2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        if(n>=0);
        {
            switch(x)
            {
                case 1:
                    if(n%2==0)
                    {
                        System.out.println("Yes");
                    }
                    else
                    {
                        System.out.println("No");
                    }
                    break;
                case 2:
                    if(n%2==1)
                    {
                        System.out.println("Yes");
                    }
                    else
                    {
                        System.out.println("No");
                    }
                    break;
                case 3:
                    int count=0;
                    for(int i=2;i<n;i++)
                    {
                        if(n%i==0)
                        {
                            count++;
                        }
                    }
                    if(count==0)
                    {
                        System.out.println("Yes");
                    }
                    else
                    {
                        System.out.println("No");
                    }
                    break;
                case 4:
                    int res=1;
                    for(int i=1;i<=n;i++)
                    {
                        res=res*i;
                    }
                    System.out.println(res);
                    break;
            }
        }
    }
}