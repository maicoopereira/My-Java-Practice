/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *Escreva um algoritmo usando while que solicite ao usuário um número inicial e
 *um número final. Calcule a soma de todos os números dentro da faixa de valor
 *informada INCLUINDO o número inicial e final
 * @author maicopereira
 */
public class atividadeEmSala23 {
    public static void main(String[] args){
        int numInicial = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inicial da sequencia numerica:"));
        int numFinal = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero final da sequencia numerica:"));  
        
        if (numInicial > numFinal){// change two variables if the start of the sequence is bigger then the end
            int temp = numFinal;
            numFinal = numInicial;
            numInicial = temp;
        }
        int soma = 0;
        while (numInicial!=numFinal+1){
            soma = soma + numInicial;
            numInicial++;
        }
        JOptionPane.showMessageDialog(null, "O valor da soma da sequência é: "+soma);
    }   
}
