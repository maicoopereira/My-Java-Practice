/*
Faça um programa em JAVA que solicite 2 números inteiros e efetue
a adição; caso o resultado seja maior que 10, apresentá-lo:
 */
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *
 * @author maicopereira
 */
public class atividadeEmSala10 {
    public static void main(String[] args){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insert the first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insert the first number"));
        int result = num1*num2;
        if (result > 10){
            JOptionPane.showMessageDialog(null, "O resultado é: "+ result);
        }
        
    }
}
