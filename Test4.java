import java.io.*;
import java.util.*;
public class Test4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int N=s.nextInt();
int Q=s.nextInt();
for(int i=0;i<=N;i++)
{
if(Q==1)
{
System.out.println(i+N);
}
else if(Q==2)
{
System.out.println(i*N);
}
else
{
System.out.println("Default");
}
}
}
}

