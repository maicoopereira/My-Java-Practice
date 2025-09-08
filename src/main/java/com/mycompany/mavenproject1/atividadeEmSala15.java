/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author maicopereira
 */
public class atividadeEmSala15 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String name = s.nextLine();
        System.out.println("Qual a sua idade?");
        int age = s.nextInt();
        s.close();

        if (age<=25 && age>=15){
            System.out.println("Nome: "+ name + "\n" +"ACEITA");
        }else{
            System.out.println("Nome: "+ name+ "\n" +"NÃO ACEITA");
        }
    }    
}
