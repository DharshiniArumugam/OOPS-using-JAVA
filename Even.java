import java.io.*;
import java.util.*;
class Even
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
int b;
{
if(a==0)
{
System.out.println("no is 0");
}
else if(a<0)
{
System.out.println("the number is negative");
}
else if(a!=0)
{
while(a>0)
{
b=a%10;
a=a/10;
if(b%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}
else
{
System.out.println(" ");
}
}
}
}

