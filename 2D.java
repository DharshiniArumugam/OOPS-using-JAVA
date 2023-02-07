import java.io.*;
import java.util.*;
class Dim
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
int x[][]=new int[a][b];
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
x[i][j]=s.nextInt();
}
}
System.out.print("elements");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
System.out.println(x[i][j]);
}
int y[][]=new int[c][d];
for(int k=0;k<c;k++)
{
for(int l=0;j<d;j++)
{
y[k][l]=s.nextInt();
}
}
System.out.print("elements");
for(int k=0;k<c;k++)
{
for(int l=0;l<d;l++)
{
System.out.println(x[k][l]);
}
System.out.println(x[i][j]+y[k][l]);
}
}
}
}