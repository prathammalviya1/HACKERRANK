import java.util.*;
public class D24Q1_ASCII
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n];
        for(int i=0;i<n;i++)
            s[i] = sc.next();
        int c = 0;
        int i =0;
        for(int k=0;k<n;k++)
        {
            if(s[k].charAt(0) >= 48 && s[k].charAt(0) <=57)
                i++;
            else
                c++;

        }
        System.out.println(i);
        System.out.println(c);
    }
}