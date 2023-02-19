import java.util.Scanner;

public class D16Q1 {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
float marks[][]=new float[N][];
for(int i=0;i<N;i++)
{

int k=sc.nextInt();
marks[i]=new float[k];
for(int j=0;j<k;j++)
{

marks[i][j]=sc.nextFloat();
}
}
        int a=sc.nextInt();
            float sum=0;
        float c=marks[a-1].length;
        for(int j=0;j<marks[a-1].length;j++)
{
 sum=sum+marks[a-1][j];
}
        float av=sum/c;
        System.out.println("Average in Subject-"+a+" is "+av);
    }
}