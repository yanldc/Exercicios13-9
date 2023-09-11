/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio493;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio493 {

    public static void main(String[] args) {
        int l, c, aux;
        int[] num = new int[10];
        String[] num1 = new String[10];
        
        Teste teste = new Teste();
        
        for(l=0; l<10; l++){
            num1[l] = JOptionPane.showInputDialog("Digite o numero: ");
            num[l] = Integer.parseInt(num1[l]);
        }
        
        c = teste.verificaOrdem(num, 10);
        
        if(c == 1){
            System.out.println("Ordem crescente");
        }else if( c == 2){
               System.out.println("Ordem decrescente");
         }else{
                 System.out.println("Não esta em ordem");
                 }
    }
}
