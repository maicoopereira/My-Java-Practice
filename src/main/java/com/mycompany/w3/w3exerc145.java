/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w3;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.ArrayList;
/**
 Write a Java program to remove the nth element from the end of a given list.
Sample Output:
Original node:
1 2 3 4 5
After removing 2nd element from end:
1 2 3 5
 * @author maicopereira
 */
public class w3exerc145 {
    public static void main(String[] args){
        //create a array
        int[] array = {1,2,3,4,5};
        int newArray[] = new int[5];
        //input a position for the array from the end
        int popElement = Integer.parseInt(JOptionPane.showInputDialog("select a position to remove, from backwards:"));
        popElement = array.length - popElement; //iterate trough the array from the end
        System.out.println(popElement);
        int i;
//           Using a list to remove
//           ArrayList<Integer> newList = new ArrayList<>();
//           for (int num: array){
//                newList.add(num);
//            }
//           newList.remove(popElement);
//           int newArray[] = newList.stream().mapToInt(i -> i).toArray();
           System.out.println(Arrays.toString(newArray));
        
        
        for (i=array.length-1; i>=0; i--){
            if (i != popElement){    //remove the given position from the array
                newArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
        

    }
}
