import java.io.*;
import java.util.*;
public class Divisible
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int r=s.nextInt();
int k=s.nextInt();
int i;
int count=0;
if(a!=0 && r!=0 && k!=0)
{
for(i=1;i<=r-1;i++);
{
count=i/k;
}
System.out.println(count);
}
else
{
System.out.println("not possible");
}
}
}
 

