/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author lohir
 */
import java.util.Scanner;

public class InsuranceCalculator 
{
    public static double cost(double x)
    {     
        double insurancecost = 5*x+300;
        return insurancecost;
    }

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);  
        System.out.println("Enter your age: ");
        double age = keyboard.nextDouble();
        age = cost(age);
        System.out.println("Insurance cost per yeaer:$" + age); 
    }
}
