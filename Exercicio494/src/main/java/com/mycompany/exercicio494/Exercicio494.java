/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio494;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio494 {

    public static void main(String[] args) {
        int l, c, t, t1;
        String[] nome = new String[3];
        String[] prof = new String[3];
        String[] end = new String[3];
        
        Troca troca = new Troca();
        
        for(l=0; l<3; l++){
            nome[l] = JOptionPane.showInputDialog("Digite o nome: ");
            prof[l] = JOptionPane.showInputDialog("Digite a profissão: ");
            end[l] = JOptionPane.showInputDialog("Digite o Endereço: ");
        }
        
        for(l=0; l<2; l++){
            for(c=l+1; c<3; c++){
                if (nome[l].compareTo(nome[c]) > 0){
                    troca.troca(nome, l, c);
                    troca.troca(prof,l,c);
                    troca.troca(end, l, c);
                }
            }
            
        }
        
        for(l=0; l<3; l++){
            System.out.println("\n" +nome[l]+ "\t" +end[l]+ "\t" +prof[l]);
            System.out.println("");
        }
    }
}
