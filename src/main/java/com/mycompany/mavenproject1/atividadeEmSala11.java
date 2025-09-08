/*
Faça um programa em JAVA que solicite 1 número inteiro, verificar
se o mesmo é múltiplo de 2 e mostrar a resposta mesmo que
negativa:
*/
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *
 * @author maicopereira
 */
public class atividadeEmSala11 {
    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insert a number"));
        int control = num%2;
        if (control == 0){
            JOptionPane.showMessageDialog(null,"o numero " + num + " é multiplo de 2");
        }
        
    }
}
