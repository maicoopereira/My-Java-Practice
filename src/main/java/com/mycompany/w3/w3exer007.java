/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3;
import java.util.Scanner;
/**
 
 Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80


 * @author maicopereira
 */
public class w3exer007 {
    public static void main(String[] args) {
        Scanner numObj = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = numObj.nextInt();
        int result = 0;
        for (int i = 1; i<=10; i++) {
            result = number * i;
            System.out.println(number + " * " + i + " = " + result );
            
        }
    }
}
