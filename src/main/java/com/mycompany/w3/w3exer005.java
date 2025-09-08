
package w3;
import java.util.Scanner;
/**
 
Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125

 * @author maicopereira
 */
public class w3exer005 {
    public static void main(String[] args){
        System.out.println("Calculadora de soma de inteiros");
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Input first number: ");
        int firstNum = myObj.nextInt();     
        
        System.out.println("Input second number: ");
        int secondNum = myObj.nextInt();
        
        int result = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum +  " = " + result);
    }
}
