/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3;
import java.util.Scanner;
/**
 *
 * Write a Java program to swap two variables.
 * 
 * @author maicopereira
 */
public class w3exer015 {
    public static void main(String[] args) {
        Scanner varObj = new Scanner(System.in);
        System.out.println("Insert the Variable A: ");
        int variableA = varObj.nextInt() ;
        System.out.println("Insert the Variable B: ");
        int variableB = varObj.nextInt() ;
        
        System.out.println("Changing the variables...");
        
        int changer = variableA;
        variableA = variableB;
        variableB = changer;
        System.out.println("Variable A now is : " + variableA);
        System.out.println("Variable B now is : " + variableB);
    }
}
