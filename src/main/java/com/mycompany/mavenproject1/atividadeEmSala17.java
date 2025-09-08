/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author maicopereira
 */
public class atividadeEmSala17 {
    public static void main(String[] args) {
        System.out.println("Profissão do Tiburcio:");
        var s = new Scanner(System.in);
        System.out.println("Escolha a profissão do Tiburcio:");
        System.out.println("Engenheiro. Programador, Médico, Advogado ou Designer");
        String tiburcioProfissao = s.nextLine();
        String tiburcioProfissaoLower = tiburcioProfissao.toLowerCase();//transform operation variable into lower case
        char control = tiburcioProfissaoLower.charAt(0); //gets the char from the first lowercase letter of the choosen operation for latter use in switch case tool
        switch(control){
            case 'e':
            System.out.println("Tiburcio é: "+ tiburcioProfissaoLower);
            break;
            case 'p':
            System.out.println("Tiburcio é: "+ tiburcioProfissaoLower);
            break;
            case 'm':
            System.out.println("Tiburcio é: "+ tiburcioProfissaoLower);
            break;
            case 'a':
            System.out.println("Tiburcio é: "+ tiburcioProfissaoLower);
            break;
            case 'd':
            System.out.println("Tiburcio é: "+ tiburcioProfissaoLower);
            break;
            default:
            System.out.println("Tiburcio é: Desempregado");
            break;
        }
    s.close();
    }    
}
