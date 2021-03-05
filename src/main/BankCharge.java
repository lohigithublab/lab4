
package main;

import java.util.Scanner;

public class BankCharge 
{
    
 public static double Fee(double i)
 {
    double Basefee;
    if(i>=60)
    {
      Basefee =10 + (0.04*i);
    }
    else if(i>=40 && i<=59)
    {
       Basefee = 10 + (0.06*i);
    }
    else if(i >=20  && i<40)
    {
       Basefee = 10 +(0.08*i);
    }
    else
    {
      Basefee = 10 + (0.10*i);
    }
    return Basefee;
 } 
  public static void main(String[] args)
  {
   System.out.println("Enter the number of checks");
   Scanner readInput = new Scanner(System.in);
   double i = readInput.nextInt();
   System.out.println("Basefee=$" +Fee(i));
  } 
}
