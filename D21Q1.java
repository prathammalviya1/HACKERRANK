import java.util.Scanner;

public class D21Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character left by nextInt()
        long aadharCount = 101;
        int panCount = 101;
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            char idProof = sc.nextLine().charAt(0);
            String idNumber = sc.nextLine();
            String accountNumber;
            if (idProof == 'A') {
                accountNumber = "A" + aadharCount;
                aadharCount++;
            } else {
                accountNumber = "P" + panCount;
                panCount++;
            }
            System.out.println(accountNumber);
        }
        sc.close();
    }
}



