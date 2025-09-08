/*
Solicitar o ano de nascimento de uma pessoa e o ano atual. Verifique
se o ano de nascimento é válido, ou seja, se o ano de nascimento é
menor que o ano atual, então mostre a idade desta pessoa.
*/
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *
 * @author maicopereira
 */
public class atividadeEmSala14 {
    public static void main(String[] args){
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano atual?"));
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Que ano você nasceu?"));
        int idadeUser;
        if (anoAtual < anoNascimento){
            JOptionPane.showMessageDialog(null,"Informações Inválidas");
        }else{
            idadeUser = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Sua idade é: "+ idadeUser);
        }
    }
}
