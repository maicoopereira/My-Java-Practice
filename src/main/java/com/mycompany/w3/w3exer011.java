/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3;

/**
 
 Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 
 Area = pi * r * r
 perimetro = 2 * pi * r
 * @author maicopereira
 */
public class w3exer011 {
    
    public static void main(String[] args){
        double raio = 7.5;
        double perimetro = raio * Math.PI * 2;
        double area = Math.PI * raio * raio;
        System.out.println("Perimeter is = " + perimetro);
        System.out.println("Area is = " + area);
    }
    
}
