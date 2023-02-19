import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class D23Q1
{
static double[] average_marks(double[][] arr1,int n2)
{
double a1,b1,c1,temp=0;
double arr3[] = new double[n2];
for(int i=0;i<n2;i++)
{
a1 = arr1[i][0];
b1 = arr1[i][1];
c1 = arr1[i][2];
if(a1>b1 && a1>c1)
{
temp = temp + a1;
if(b1>c1)
{
temp = temp + b1;
temp = temp/2;
arr3[i] = temp;
}
else
{
temp = temp + c1;
temp = temp/2;
arr3[i] = temp;
}
}
else if(b1>a1 && b1>c1)
{
temp = temp + b1;
if(a1>c1)
{
temp = temp + a1;
temp = temp/2;
arr3[i] = temp;
}
else
{
temp = temp + c1;
temp = temp/2;
arr3[i] = temp;
}
}
else if(c1>a1 && c1>b1)
{
temp = temp + c1;
if(a1>b1)
{
temp = temp + a1;
temp = temp/2;
arr3[i] = temp;
}
else
{
temp = temp + b1;
temp = temp/2;
arr3[i] = temp;
}
}
temp = 0;
}
return arr3;
}
static void print_arr(double[] arr2, int n)
{
for(int i=0;i<arr2.length;i++)
{
if(n == 1) System.out.print((int) arr2[i]+" ");
else System.out.print(arr2[i]+" ");
}
}
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int n = in.nextInt();
if(n>0)
{
double[][] arr = new double[n][3];
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j] = in.nextDouble();
}
}
double[] result = average_marks(arr,n);
print_arr(result, n);
}
}
}