import java.io.*;
import java.util.*;
public class Multiply
{
public static void main(String args[])
{
int n,i;
int mul=1;
double avg=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println("the elements");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
mul=mul*a[i];
avg=mul/n;
System.out.print(a[i]);
}
System.out.print("\n");
System.out.println(mul);
System.out.println(avg);
}
}