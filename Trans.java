import java.io.*;
import java.util.*;
public class Trans
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter row");
int r=s.nextInt();
System.out.println("Enter column");
int c=s.nextInt();
int temp;
System.out.println("Enter array");
int a[][]=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("the transpose");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a[j][i]+" ");
}
System.out.println(" ");
}
System.out.println("the determinant");
temp=0;
temp=a[0][0]*a[1][1]-a[0][1]*a[1][0];
System.out.println(temp);
}
}
