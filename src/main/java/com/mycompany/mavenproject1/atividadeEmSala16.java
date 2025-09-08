/*
Implemente uma calculadora,
primeiro peça 2 números ao usuário (um de cada vez)
e apresente as seguintes opções:
adição
subtração
Mostre o resultado após a operação.
 */
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *
 * @author maicopereira
 */
public class atividadeEmSala16 {
    public static void main(String[] args){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insert the first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insert the second number"));
        
        String inputControl = JOptionPane.showInputDialog("Escolha entre adição e subtração:");
        char controlChar = inputControl.charAt(0);
        int result;
        switch(controlChar){
                case 'a':
                    result = num1+num2;
                    JOptionPane.showMessageDialog(null,"O resultado é: "+ result);
                    break;
                case 's':
                    result = num1-num2;
                    JOptionPane.showMessageDialog(null,"O resultado é: "+ result);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
        }
    }
}
