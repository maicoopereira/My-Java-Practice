/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author maicopereira
 */
public class atividadeEmSala22 {
        public static void main(String[] args) {
        System.out.println("Escreva um algoritmo para calcular e mostrar a média dos números entre 1 e 1000 usando while");
        double resposta = 0;
        int i = 0;
        while (i<1001){
            resposta = resposta + i;
            i++;
        }
        resposta = resposta/1000;
        System.out.print(resposta);
        
    }
}
