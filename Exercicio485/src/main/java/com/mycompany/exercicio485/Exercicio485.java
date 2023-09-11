/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio485;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio485 {

    public static void main(String[] args) {
        int l, c;
        int[] num = new int[6];
        String[] num1 = new String[6];
        String[] n = new String[6];

        Multi conv = new Multi();

        for (l = 0; l < 6; l++) {
            n[l] = JOptionPane.showInputDialog("Digite o numero ");
            num[l] = Integer.parseInt(n[l]);
        }

        for (int i = 0; i < 6; i++) {
            num1[i] = JOptionPane.showInputDialog("Digite o caractere ");
        }

        c = conv.multiVetor(num, num1, 6); // Chamar a função depois de ler os números e caracteres

        System.out.print("Resultado da função multiVetor: " + c);
    }
}