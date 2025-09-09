/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w3;
import java.util.Scanner;
/**
 *2. Compute Average of Three Numbers

Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
 * @author maicopereira
 */
public class w3method002 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Insert the first number: ");
        double num1 = s.nextDouble();
        System.out.print("Insert the first number: ");        
        double num2 = s.nextDouble();
        System.out.print("Insert the first number: ");
        double num3 = s.nextDouble();
        s.close();
        double result = mediaForThreeNums(num1, num2, num3);
        System.out.print("The media for the three numbers is: "+result);
    }
    
    public static double mediaForThreeNums(double a, double b, double c){
        double media = (a+b+c)/3;
        return (media);
    }
}
