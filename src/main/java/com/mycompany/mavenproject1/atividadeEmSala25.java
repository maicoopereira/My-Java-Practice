/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import javax.swing.*;
/**
 *Implemente e execute o código de pesquisa linear dado em aula, incluindo
 *códigos para INTERROMPER a varredura completa do vetor, quando o
 *elemento procurado é encontrado
 * @author maicopereira
 */
public class atividadeEmSala25 {
    public static void main(String args[]){
        int i;
        boolean flag = true;
        int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas a ser cadastrado "));
        String vetorPesquisado[] = new String[numElementos];
        for(i=0; i<numElementos;i++){
            vetorPesquisado[i] = JOptionPane.showInputDialog("Digite o nome para cadastro");
        }
        String elementoProcurado = JOptionPane.showInputDialog("Digite o nome a ser procurado");
        
        for(i=0; i<numElementos;i++){
            if (vetorPesquisado[i].equalsIgnoreCase(elementoProcurado)){
                JOptionPane.showMessageDialog(null,"o valor procurado foi encontrado na posição "+i);
            flag = false;
            break;
            }
        }
        if (flag){
            JOptionPane.showMessageDialog(null, "o nome não foi encontrado.");
        }
    }
}

