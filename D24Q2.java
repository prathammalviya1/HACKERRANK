import java.io.*;
import java.util.*;

public class D24Q2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empId=sc.nextInt();
        String eName=sc.next();
        String eDesignation=sc.next();
        int Salary;
       if (empId<201){
           System.out.println("No Appraisal");
       }
        else if(empId>=201){
            Salary=20000;
            System.out.println(eName);
            System.out.println(empId);
            System.out.println(Salary+1000);
        }
        
            
            
            
        
    }
}