import java.util.Scanner;
public class D3Q2
{
    public static void main(String[] args) {
        
       // System.out.println("Hello World");
        Scanner bh=new Scanner(System.in);
        int N=bh.nextInt();
        int flag=0;
        int i;
        
        for (i=1; i<N; i++){
            if((N/i==i )&(N%i==0)) {
                    System.out.println("Perfect Square");
                    flag=1;
                    break;
            }
          
        }
          if(flag==0){
                System.out.println("Not Perfect Square");

            }
    }
        
} 
    

