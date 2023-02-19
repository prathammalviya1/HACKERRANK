import java.util.Scanner;

public class D12Q1{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        if(s1.length()<=50 && s2.length()<=50 && s3.length()<=50) {
            if (s1.length()>s2.length() && s1.length()>s3.length()){
                System.out.println(s1.length()-1);
            }
            else if (s2.length()>s1.length() && s2.length()>s3.length()){
                System.out.println(s2.length());
            }
            else if (s3.length()>s1.length() && s3.length()>s2.length()){
                System.out.println(s3.length());
            }
            else if(s1.length()==s2.length() && s2.length()==s3.length()){
                System.out.println(-1);
            }
        }
        else{
            System.out.println("Invalid");
        }

    }
}