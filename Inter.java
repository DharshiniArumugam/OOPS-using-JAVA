import java.io.*;
import java.util.*;
public class Inter
{
public static void main(String args[])
{
int a[]={1,2,3,8,9};
int b[]={1,2,5,6,7};
int i,j;
for(i=0;i<=a;i++)
{
for(j=0;j<=b;j++)
if(a[i]==b[j])
{
System.out.println(a[i]);
}
}
}
}
