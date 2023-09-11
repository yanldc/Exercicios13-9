/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio487;
import javax.swing.JOptionPane;

/**
 *
 * @author yan-l
 */
public class Exercicio487 {

    public static void main(String[] args) {
        int l, c;
        int[] num = new int[10];
        String[] n = new String[10];
        
        Inverter inv = new Inverter();
        
        for(l=0; l<10; l++){
            n[l] = JOptionPane.showInputDialog("Digite o numero: ");
            num[l] = Integer.parseInt(n[l]);
        }
        
        inv.inverte(num);
        for(l=0; l<10; l++){
            System.out.println("Vetor " +(l+1)+ " :" + num[l]);
        }
    }
}
