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
public class atividadeEmSala09 {
    public static void main(String[] args){
        String controle;
        controle = JOptionPane.showInputDialog("Você concorda com os termos apresentados ? (s/n)");
        char controleCHAR = controle.charAt(0);
            switch(controleCHAR){
                case 's':
                    JOptionPane.showMessageDialog(null,"SIM, você concorda ! ");
                    break;
                case 'n':
                    JOptionPane.showMessageDialog(null,"NÃO, você não concorda ! ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida! ");
                    break;

        }    
    }
}
