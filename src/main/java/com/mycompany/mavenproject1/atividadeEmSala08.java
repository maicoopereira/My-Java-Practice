/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *
 * @author maicopereira
 */
public class atividadeEmSala08 {
    public static void main(String[] args) {
        int controle, resultado;
        int numero1 = 10;
        int numero2 = 5;
        controle = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você quer executar ?"
        + " \n 1 - adição "+"\n 2 - subtração"));

        switch(controle){
            case 1:
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            case 2:
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida! ");
            break;
    }
}
    
}
