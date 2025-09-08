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
public class atividadeEmSala18 {
       public static void main(String[] args) {
        System.out.println("Calculadora de descontos:");
        var s = new Scanner(System.in);
        
        System.out.println("Digite o nome do cliente:");
        String nomeString = s.nextLine();
        
        System.out.println("Insira a categoria do produto:");
        String categoriaDoProdutoString = s.nextLine();
        char categoriaDoProduto = categoriaDoProdutoString.charAt(0);

        System.out.println("Insira o valor do produto:");
        String valorDoProdutoString = s.nextLine();
        float valorDoProduto = Float.parseFloat(valorDoProdutoString);
        float valorFinal = 0;
/**
A = 0,9
B = 0,85
C = 0,8
D = 0,75
E = 0,5
*/
        switch(categoriaDoProduto){
            case 'a':
            System.out.println("Produto com desconto!");
            valorFinal = (float) (valorDoProduto * 0.9);
            break;
            case 'b':
            System.out.println("Produto com desconto!");
            valorFinal = (float) (valorDoProduto * 0.85);
            break;
            case 'c':
            System.out.println("Produto com desconto!");
            valorFinal = (float) (0.8 * valorDoProduto);
            break;
            case 'd':
            System.out.println("Produto com desconto!");
            valorFinal = (float) (valorDoProduto * 0.75);
            break;
            case 'e':
            System.out.println("Produto com desconto!");
            valorFinal = (float) (valorDoProduto * 0.5);
            break;
            default:
            System.out.println("Produto sem desconto!");
            break;
        }
        System.out.println("O cliente "+nomeString+" irá pagar "+ valorFinal);
    s.close();
    }
}
