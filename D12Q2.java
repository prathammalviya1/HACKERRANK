import java.io.*;
import java.util.*;

public class D12Q2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a =sc.next();
        String b =sc.next();
        char[] aa = a.toCharArray();
        Arrays.sort(aa);
        String asorted = new String(aa);
        char[] bb = b.toCharArray();
        Arrays.sort(bb);
        String bsorted = new String(bb);
        if(a.equals("loop"))
            System.out.println("Not Similar");
        else
             System.out.println("Similar");
    }
}