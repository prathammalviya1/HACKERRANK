import java.util.Scanner;

public class D8Q2 {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int num1 = scan.nextInt();
int num2 = scan.nextInt();
if(num1 < 0 || num1 > 127 || num2 < 0 || num2 > 127)
System.out.println("Invalid");
else {
for (int i = 1; i <= 7; i++) {
if ((num2 << i) == num1) {
System.out.println("Yes");
return;
}
}
System.out.println("No");
}
}
}

// import java.util.Scanner;
// public class day8q2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         if (num1 < 127 && num2 < 127 && num1 > 0 && num2 > 0) {
//             while (num1 > num2) {
//                 num2 = num2 << 1;
//             }
//             if (num1 == num2){
//                 System.out.println("Yes");
//                        }
//             else {
//                 System.out.println("No");
                
//             }
//         } else {
//             System.out.println("Invalid");
//             System.exit(0);
//         }
//     }
// }