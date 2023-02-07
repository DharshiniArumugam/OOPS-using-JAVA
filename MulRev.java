import java.io.*;
import java.util.*;
class MulRev
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the positive integer");
int a=s.nextInt();
int i;
for(i=0;i<=a;i++)
{
int c=a*i;
System.out.printf("%d*%d=%d\n",i,c);
}
}
}
