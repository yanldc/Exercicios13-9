/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio497;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio497 {

    public static void main(String[] args) {
        int l, c, n, aux;
        int[] num = new int[10];
        String[] num1 = new String[10];
        String n1;
        
        Ordena ordena = new Ordena();
        
        for(l=0; l<10; l++){
            num1[l] = JOptionPane.showInputDialog("Digite o numero: ");
            num[l] = Integer.parseInt(num1[l]);
        }
         n1= JOptionPane.showInputDialog("Digite o numero para pesquisa: ");
         n= Integer.parseInt(n1);
         
         ordena.ordena(num, 10);
         
         c = ordena.busca(num, 10, n);
         
         System.out.print("\n VETOR \n");
         
         for(l=0; l<10; l++){
             System.out.print("\n" + (l+1) + "-" + num[l]);
         }
         c++;
         
         if(c != 0){
             System.out.print("\nO numero " + n +" esta na posição no vetor: "+ c);
         }else{
             System.out.print("\n NÃO ENCONTRADO ");
         }
         System.out.print("\n ");
    }
}
