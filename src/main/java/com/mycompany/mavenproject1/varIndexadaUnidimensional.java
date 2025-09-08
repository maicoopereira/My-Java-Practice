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
public class varIndexadaUnidimensional {
    public static void main(String[] args){
        int i;
        String nomes[] = new String[5];
        for (i = 0; i<5; i++){
            nomes[i] = JOptionPane.showInputDialog("Digite um nome:");
        }
        JOptionPane.showMessageDialog(null, nomes);
    }
}
