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
public class atividadeEmSala19 {
    public static void main(String[] args){
        var s = new Scanner(System.in);
        System.out.print("Escreva uma frase: ");
        String frase = s.nextLine();
        System.out.print("\nQuantas vezes devo repetir a frase? ");
        int repetirVezes = s.nextInt();
        for (int i = 0; i< repetirVezes;i++){
            System.out.println(frase);
        }    
        s.close();
    } 
}
