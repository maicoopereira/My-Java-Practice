/*
A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários
estatutários. O valor máximo da prestação não poderá ultrapassar 30% do
salário bruto. Faça um algoritmo que permita entrar com o salário bruto e o
valor da prestação e informar se o empréstimo pode ou não ser concedido.
 */
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *
 * @author maicopereira
 */
public class atividadeEmSala13 {
    public static void main(String[] args){
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu salario bruto: "));
        double installment = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da parcela: ")); 
        if (installment <= salary*0.3){
            JOptionPane.showMessageDialog(null, "Crédito pode ser aprovado ao funcionário");
        }else{
            JOptionPane.showMessageDialog(null, "Crédito negado ao funcionário");
        }
    }
}
