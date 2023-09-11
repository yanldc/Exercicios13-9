/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio499;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio499 {

    public static void main(String[] args) {
        int l, flag, op;
        int[] num = new int[5];
        String op1;
        flag=0;
        
        Menu menu = new Menu();
        
        for(l=0; l<5; l++){
            num[l] = 0;
        } 
        do{
            System.out.print("\n \n \n");
            System.out.print("\n MENU VETOR - FUNÇÃO \n");
            System.out.print("\n1 Dados do Vetor");
            System.out.print("\n2 Ordena Vetor");
            System.out.print("\n3 Imprime Vetor");
            System.out.print("\n4 Sai do programa");
            op1 = JOptionPane.showInputDialog("\n\nDigite sua escolha: ");
            op = Integer.parseInt(op1);
            
            switch(op){
                case 1: menu.entrada(num, 5);
                           flag =1;
                           break;
                           
                case 2: if(flag == 1){
                          menu.ordena(num, 5);
                            }else{
                                 System.out.println("Escolha primeiro a opção 1");
                                 }           
                         break;
                case 3: if(flag == 1){
                          menu.imprime(num, 5);
                            }else{
                                 System.out.println("Escolha primeiro a opção 1");
                                 }           
                         break;
                case 4: System.out.println("Saindo do algoritmo");
                         break;
                default: System.out.println("Opção invalida");        
            }
            
            
        }while(op != 4);
    }
}
