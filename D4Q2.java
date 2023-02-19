import java.util.Scanner;
public class D4Q2 {
    
    public static void main(String[] args) {
// int flag=0;
    Scanner bh=new Scanner(System.in);
            float Silver=bh.nextFloat();
    float Gold=bh.nextFloat();
    String choice=bh.next();
    float weight=bh.nextFloat();
        float ans;
        float an;
      if(weight>=0.01 && weight<=1000){
    if(choice.equals("Silver")){
      ans=(Silver/1000)*weight;
        int fans=(int)ans;
          System.out.println(fans);
        
    }
    else if(choice.equals("Gold")){
     an=(Gold/10)*weight;
        int Fans=(int)an;
           System.out.println(Fans);
        // flag=1;
     }}
        else {
            System.out.println("Invalid Input");
        }
    }
}