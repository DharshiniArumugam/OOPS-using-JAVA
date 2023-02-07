import java.io.*;
import java.util.*;
public class Largest
{
public static void main(String args[])
{
int n,l,m;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println("the elements");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
l=a[0];
m=a[0];
for(int i=1;i<n;i++)
{
if(l<a[i])
{
l=a[i];
}
else if(m>a[i])
{
 m=a[i];
}
}
System.out.println("the larg=" + l);
System.out.println("the small=" + m);
}
} 