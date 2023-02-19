import java.util.Scanner;
public class D18Q2 {

    public static void main(String[] args) {
     
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    if(n>=0){
        double a[]=new double[n];
        for(int i=0;i<n;i++ ){
            a[i]=s.nextDouble();
            if(a[i]<=0){
                System.out.println("Invalid Array Elements");
                return;
            }
        }
        for(int j=0;j<n;j++){
            System.out.println((int)a[j]);
        }
    }
        else{
            System.out.println("Invalid Array Size");
        }
        
    }
}