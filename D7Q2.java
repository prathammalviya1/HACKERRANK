import java.util.Scanner;
public class D7Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
         if(yr>999 && yr<10000){
        
            if(yr%4==0 ) {         
                System.out.println("Born In Leap Year");
            }
             else if(yr%100==0 && yr%400==0 ){
                 System.out.println("Born In Leap Year");
             }
            else{
               
                System.out.println("Not Born In Leap Year");
                
            }
         }
    
        else{
            System.out.println("Invalid Input");
            
        }
    }
}