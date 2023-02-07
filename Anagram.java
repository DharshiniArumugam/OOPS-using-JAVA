import java.io.*;
import java.util.*;
public class Anagram
{
public static void main(String args[])
{
int count=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the testcase");
int t=s.nextInt();
System.out.println("Enter string1");
String a=s.nextLine();
System.out.println("Enter String2");
String b=s.nextLine();
char x[]=new char[100];
x=a.toCharArray();
char y[]=new char[100];
y=b.toCharArray();
for(int i=0;i<x.length;i++)
{
 if(x[i]==y[i])
{
 System.out.print("");
}
else if(x[i]!=y[i])
{
 count=count+1;
}
}  
System.out.println(count);
}
}
