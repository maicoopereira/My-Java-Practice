/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *(Fazer como busca ativa!) Faça um algoritmo que leia uma matriz
 *de ordem 3x3 de números inteiros. Após a leitura faça:

 *Calcule e mostre a soma dos elementos da primeira coluna;
 *Calcule e mostre a soma dos elementos de cada coluna;
 *Calcule e mostre o produto dos elementos da primeira linha;
 *Calcule e mostre a soma de todos os elementos da matriz;
 *Calcule e mostre a média dos elementos da matriz;
 *Calcule e mostre os elementos que são maiores que a média;
 *Calcule e mostre o maior elemento da matriz e sua posição;
 *Calcule e mostre o menor elemento da matriz e sua posição;

 * @author maicopereira
 */
public class atividadeEmSala26 {
    public static void main(String[] args){
        Random random = new Random();
        int matrix[][] = new int[3][3];
        int i,j, randNum;
        for (i=0; i < 3; i++){
            for (j=0; j < 3; j++){
                randNum = random.nextInt(10);
                matrix[i][j] = randNum;
                System.out.print(randNum+" ");
            }
            System.out.println();
        }
   
        int soma = 0;
    //soma da primeira coluna
        for (i = 0; i<3; i++){
            soma = soma + matrix[i][0];
        }
        System.out.println("A soma da primeira coluna é: "+soma);
    //soma dos elementos de cada coluna
        soma = 0;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                soma = soma+ matrix[i][j];
                
            }
            System.out.println("A soma da linha "+ i + " é: " + soma);
            soma = 0;
        }
    //produto dos elementos da primeira linha     
        soma=1;
        for (i = 0; i<3; i++){
            soma = soma * matrix[i][0];
        }
        System.out.println("O produto dos elementos da primeira coluna é: "+soma);
    //a soma de todos os elementos da matriz;
        soma=0;
        for (int row[]:matrix){
            for (int element:row){
                soma = soma +element;
            }
        }
            System.out.println("A soma de todos os elementos da matriz é: "+soma);
    //a media de todos os elementos da matriz
        float media=0;
        for (int row[]:matrix){
            for (int element:row){
                media = media +element;
            }
        }
        media = media/9;
        System.out.println("A media de todos os elementos da matriz é: "+media);
    //elementos que são maiores que a média
        String s="";
        for (int row[]:matrix){
            for (int element:row){
                if (element > media){
                    s = s+ element+" ";
                }
            }
        }
        System.out.println("Os valores maiores que a media são: "+ s);
    //Calcule e mostre o maior elemento da matriz e sua posição;
        int largestElement = 0;
        int rowNum = 0;
        int columnNum = 0;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                if(matrix[i][j]>largestElement){
                    largestElement = matrix[i][j];
                    rowNum = i;
                    columnNum = j;
                }
            }
        }
        System.out.println("O maior valor da matriz é: "+largestElement+", na linha: "+rowNum+" e na coluna: " + columnNum);
    //Calcule e mostre o menor elemento da matriz e sua posição;
        int smallestElement = largestElement;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                if(matrix[i][j]<smallestElement){
                    smallestElement = matrix[i][j];
                    rowNum = i;
                    columnNum = j;
                }
            }
        }
        System.out.println("O menor valor da matriz é: "+smallestElement+", na linha: "+rowNum+" e na coluna: " + columnNum);
    }
}
