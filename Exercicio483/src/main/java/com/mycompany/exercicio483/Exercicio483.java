/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio483;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio483 {

    public static void main(String[] args) {
        int l, c;
        int[] num = new int[4];
        int[] num1 = new int[4];
        String[] nm = new String[4];
        String[] nm1 = new String[4];
        
        Calc conv = new Calc();
        
        for(l=0; l<=3;l++){
        nm[l] = JOptionPane.showInputDialog("Digite o numero do vetor A: ");
        num[l] = Integer.parseInt(nm[l]);            
        }
        for(l=0; l<=3;l++){
        nm1[l] = JOptionPane.showInputDialog("Digite o numero do vetor B: ");
        num1[l] = Integer.parseInt(nm1[l]);            
        }
        
        c = conv.produtoInterno(num, num1, 4);
        System.out.print("VETOR A \t Vetor B \n");
         for(l=0; l<=3;l++){
             System.out.print("\n"+ num[l]+ "\t" +num1[l]);
         }
        System.out.println("\n\n Produto Interno: " + c);
    }
}
