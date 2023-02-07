import java.io.*;
import java.util.*;
public class AB
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int N=s.nextInt();
int Q=s.nextInt();
int a=0;
int b=1;
Double c;
if(Q==1)
{
for(int i=1;i<=N;i++)
{
a=a+i;
}
System.out.println(a);
}
else if(Q==2)
{
for(int i=1;i<=N;i++)
{
b=b*i;
}
System.out.println(b);
}
else if(Q>=10)
{
for(int i=1;i<=N;i++)
{
c=(Math.pow(10,9))+7;
}
System.out.println(b);
}
else
{
System.out.println("wrong");
}
}
}