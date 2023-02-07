import java.io.*;
class Customer
{
int Accno;
String Name;
Float Bal;
void insertRecord(int r,String n,Float f)
{
Accno=r;
Name=n;
Bal=f;
}
float returnBal(){
return Bal;}

void displayInformation()
{
System.out.println(Bal);
}
}
class Acustomer5
{
public static void main(String args[])
{
Customer c1=new Customer();
Customer c2=new Customer();
c1.insertRecord(111,"Karan",200.23f);
c2.insertRecord(222,"Aryan",300.38f);
float g=c1.returnBal();
float g1=c2.returnBal();
System.out.println(g+g1);
}
}


