/*
Faça um programa em JAVA que solicite 2 números inteiros, verificar qual é
o número maior e mostrar na tela, ou se forem iguais, mostrar uma
mensagem indicando esta informação.
 */
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *
 * @author maicopereira
 */
public class atividadeEmSala12 {
    public static void main(String[] args){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insert a number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insert another number: "));
        if (num1>num2){
            JOptionPane.showMessageDialog(null, num1 + " é maior que " + num2);
        }else{
            if (num1<num2){
                JOptionPane.showMessageDialog(null, num2 + " é maior que " + num1);
            }
            else{
                JOptionPane.showMessageDialog(null, num1 + " é igual ao " + num2);
            }
        }
    }
}
