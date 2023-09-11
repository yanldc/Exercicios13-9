/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio499;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Menu {
    int entrada ( int[] vet, int t){
        int l;
        String[] vet1 = new String[t];
        
        for(l=0; l<t; l++){
            vet1[l] = JOptionPane.showInputDialog("\nDigite o numero: ");
                      vet[l] = Integer.parseInt(vet1[l]);
        }
        return(vet[0]);
    }
    
   int imprime (int vet[], int t){
       String[] vet1 = new String[t];
       int l;
       
       System.out.print("\n VETOR \n");
       for(l=0; l<t; l++){
           System.out.print("\n" + (l+1) + "-" + vet[l]);
       }
       return(vet[0]);
   }
    
   int ordena (int vet[], int tam){
       int l1, c1, aux;
       
       for(l1=0; l1< tam-1; l1++){
           for(c1=l1; c1<tam; c1++){
               if(vet[l1] > vet[c1]){
                   aux = vet[l1];
                   vet[l1] = vet[c1];
                   vet[c1] = aux;
               }
           }
       }
       return(vet[0]);
   }
    
}
