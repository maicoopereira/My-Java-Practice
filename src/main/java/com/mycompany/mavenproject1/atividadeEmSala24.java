/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *Escreva um algoritmo que mostre todos os números pares entre 13 e 23
 *usando do..while.
 * @author maicopereira
 */
public class atividadeEmSala24 {
    public static void main(String[] args){
    int value = 1;
    int par;
    String s = "";
    int lineSize = 0;
    do{
        par = value%2;
        if (par == 0){
            if (s == ""){
                s = String.valueOf(value);
            }else{
                s = s +", " + value;
            }
        }
        if (lineSize == 20){
            lineSize = 0;
            s = s +"\n";
        }
        value++;
        lineSize++;
    }while(value<204);
    JOptionPane.showMessageDialog(null, s);
}
}