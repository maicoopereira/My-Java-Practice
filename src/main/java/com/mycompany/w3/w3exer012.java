/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3;
import java.util.Scanner;

/**
 *
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 * 
 * @author maicopereira
 */
public class w3exer012 {
    public static void main(String[] args){
        /**Creates a new scanner named numObj to receive input numbers*/
        Scanner numObj = new Scanner(System.in);
        /**Prints the message and right after reads the user input number 3 times*/
        System.out.println("Insert the first number: ");
        float firstNum = numObj.nextInt();
        System.out.println("Insert the second number: ");
        float secondNum = numObj.nextInt();
        System.out.println("Insert the third number: ");
        float thirdNum = numObj.nextInt();
        /**Calculates the media and print the value*/
        float media = (firstNum + secondNum + thirdNum)/3;
        System.out.println("The media is: " + media);
    }
}
