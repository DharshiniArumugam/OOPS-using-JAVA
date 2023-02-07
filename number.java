import java.io.*;
import java.util.*;
public class number
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
if(a<0)
{
System.out.println("Its negative");
}
else if(a>0)
{
System.out.println("Its positive");
}
else
{
System.out.println("Its neutral");
}
}
}