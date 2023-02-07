import java.io.*;
public class Pattern
{
public static void main(String args[])
{
int i,j;
for(i=1;i<=4;i++)
{
for(j=4;j>i;j--)
{
System.out.printf(" ");
}
for(j=1;j<=i;j++)
{
System.out.printf("%d ", j);
}
System.out.println("\n");
}
}
}