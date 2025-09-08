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
public class variavelIndexada2 {
    public static void main(String[] args){
        int i;
        double nomes[] = new double [20];
        nomes[0] = 0;
        nomes[1] = 1;
        nomes[2] = 2;
        for (i = 0; i<5; i++){ //O valor base de preenchimento sera Null para String, para Int sera 0
            JOptionPane.showMessageDialog(null,"O nome na posição "+i+" é "+nomes[i]);
        }
    }
    
}
