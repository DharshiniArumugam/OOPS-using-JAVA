import java.io.*;
import java.util.*;
class Zpattern
 {
   public static void main(String[] args) 
{
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int n = input.nextInt(); 
   for (int i = 0; i <= n; i++) 
{
  for (int j = n; j >= 1; j--) 
{
 if (j > i) 
{
 System.out.print("* ");            
}
  else
{
System.out.print(" ");
} 
System.out.println(); 
}
}      
}
}
