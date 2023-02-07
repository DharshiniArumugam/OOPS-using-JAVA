import java.io.*;
class Customer2
{
int Accno;
String Name;
Float Bal;
}
class ACustomer2
{
public static void main(String args[])
{
Customer1 c1=new Customer1();
Customer1 c2=new Customer1();
c1.Accno=2001;
c1.Name="Sakthi";
c1.Bal=200.34f;
c2.Accno=2002;
c2.Name="Dharshu";
c2.Bal=300.34f;
System.out.println(c1.Accno+" "+c1.Name+" "+c1.Bal);
System.out.println(c2.Accno+" "+c2.Name+" "+c2.Bal);
}
}