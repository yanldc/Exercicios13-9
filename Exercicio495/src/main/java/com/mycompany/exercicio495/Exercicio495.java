/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio495;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio495 {

    public static void main(String[] args) {
        int l, c, t, t1;
        String[] nome = new String[5];
        
        Ordena ordena = new Ordena();
        
        for(l=0; l<5; l++){
            nome[l] = JOptionPane.showInputDialog("Digite o nome: ");
             
        }
        ordena.ordena(nome, 5);
        
        System.out.println("\n Nomes ordenados");
        
        for(l=0; l<5; l++){
            System.out.print("\n" + (l+1) + "-" + nome[l]);
        }
        System.out.print("");
    }
}
