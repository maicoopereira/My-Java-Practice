/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3;

/**
 *
    Write a Java program to print the area and perimeter of a rectangle.
    Test Data:
    Width = 5.5 Height = 8.5

    Expected Output
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20
 * 
 * @author maicopereira
 */
public class w3exer013 {
    public static void main(String[] args){
        double width = 5.5;
        double height = 8.5;
        double rectArea = width * height ;
        double rectPerimeter = 2* (width + height);
        System.out.println("The area is: " + rectArea);
        System.out.println("The perimeter is is: " + rectPerimeter);
    }
}
