/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio490;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio490 {

      public static void main(String[] args) {
        String[] nome = new String[10];
        int l;

        Rest rest = new Rest();

        for (l = 0; l < 10; l++) {
            nome[l] = JOptionPane.showInputDialog("Digite palavras em letras minusculas: ");
        }

        // Chame rest.restantes para substituir todas as ocorrências da letra "c"
        rest.restantes(nome, "c");
        
        for (l = 0; l < 10; l++) {
            System.out.println(nome[l]);
        }
    }
}
