/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w3;
import java.util.Scanner;
/**

Write a Java method to find the smallest number among three numbers.

Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
 
 * @author maicopereira
 */
public class w3method001 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Insert the first number: ");
        int num1 = s.nextInt();
        System.out.print("Insert the second number: ");
        int num2 = s.nextInt();
        System.out.print("Insert the third number: ");
        int num3 = s.nextInt();
        
        int result = smallestNum(num1, num2, num3);
        
        System.out.println("The Smallest num is: "+result);
    }
    public static int smallestNum(int a, int b, int c){
        int min = a;
        
        if(min>b){
            min = b;
        }
        
        if (min > c){
            min = c;
        }
        
        return(min);
    }
}
