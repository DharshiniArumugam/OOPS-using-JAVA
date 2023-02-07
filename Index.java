import java.io.*;
import java.util.*;
public class Index
{
public static void main(String args[])
{
int i,flag=0,M=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the array num");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the array number");
int b[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();  
}
System.out.println("Enter Target");
int t=s.nextInt();
for(i=0;i<n;i++)
{
  if(a[i]==t)
{
M=i;
flag=1;
break;
}  
else
{
flag=0;
}
}
if (flag==1)
{
System.out.println(M);
}
else
{
System.out.println("-1");
}
}
}
