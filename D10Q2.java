import java.util.Scanner;
public class D10Q2 {
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        int a=age.nextInt();
        int b=age.nextInt();
        int c=age.nextInt();
       if(a>=0 && a<=100 && b>=0 && b<=100 && c>=0 && c<=100) {
           if (a>b && a>c && b<c){

            System.out.println(a+" is Oldest");
             System.out.println(b+" is Youngest");
        }
        else if (a>b && a>c && c<b){

            System.out.println(a+" is Oldest");
             System.out.println(c+" is Youngest");
        }
          else if (a>b && a>c && b<c){

            System.out.println(a+" is Oldest");
             System.out.println(b+" is Youngest");
        }
        else if (b>a && b>c && a<c){

            System.out.println(b+" is Oldest");
             System.out.println(a+" is Youngest");
        }
            else if (b>a && b>c && c<a ){

            System.out.println(b+" is Oldest");
             System.out.println(c+" is Youngest");
        }
        else if (c>a && c>b && a<b){

            System.out.println(c+" is Oldest");
             System.out.println(a+" is Youngest");
        }
           else if (c>a && c>b && b<a){

            System.out.println(c+" is Oldest");
             System.out.println(b+" is Youngest");
        }
       }
        
        else{
            System.out.println("Invalid");
        }
    }
}