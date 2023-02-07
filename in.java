import java.io.*;
import java.util.*;
public class in
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int n=s.nextInt();
int sum;
int i;
sum=a+b;
{
for(i=1;i<n;i++)
{
sum=(int)(sum+(Math.pow(2,i)*b));
System.out.print(sum);
}
}
}
}