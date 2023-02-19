
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class D3Q1 {

public static void main(String[] args) {
//Declarations
int[] a={0,0,0,0};
int[] b={0,0,0,0};
int odd=0,even=0,odd1=0,even1=0;
// for invalid condition
int flag =0;
// for Taking Inputs
Scanner sc = new Scanner(System.in);
for(int i=0;i<4;i++){
int x = sc.nextInt();
if(x>13)flag=1;
a[i]= x;
}
for(int i=0;i<4;i++){
int y = sc.nextInt();
if(y>13)flag=1;
b[i]=y;
}
//checking even and odd of 1st array
for(int i=0;i<4;i++){
if(a[i]%2==0)even++;
else odd++;
}
//checking even and odd of 2nd array
for(int i=0;i<4;i++){
if(b[i]%2==0)even1++;
else odd1++;
}
//taking maximum from even and odd values
int cmp = Math.max(even,odd);
int cmp2 = Math.max(even1,odd1);
//Giving Outputs
if(flag==1)System.out.println("Invalid Input");
else if (cmp==cmp2)System.out.println("Tie");
else if (cmp<cmp2)System.out.println("Saurav Lost");
else System.out.println("Saurav Won");



}
} 
    
