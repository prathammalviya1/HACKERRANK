import java.util.Scanner;
public class D1Q2{
    public static void main(String[] args){
 
        Scanner bh= new Scanner (System.in);
        int a=bh.nextInt();
        int b=bh.nextInt();
        char c=bh.next().charAt(0);
//         if(c=='+'){
//              System.out.println(a+b);
//         }
//          else if(c=='-'){
//              System.out.println(a-b);
//         }
//           else if(c=='*'){
//              System.out.println(a*b);
//         }
//           else if(c=='/'){
//              System.out.println(a/b);
//         }
//         else{
//          System.out.println("Invalid arithmetic operators");
//         }
       
     
           
       switch (c){
            case '+':
              System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
             System.out.println(a*b);  
                break;
            case '/':
                System.out.println(a/b);
      break;
               default:
           
                  
              System.out.println("Invalid arithmetic operators");
              

                
        }
            
        }
        
    
}