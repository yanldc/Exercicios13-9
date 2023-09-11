/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio481;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio481 {

    public static void main(String[] args) {
        int num, base, c;
        String numero;
        String baseD;
        
        Calc conv = new Calc();
            
        numero = JOptionPane.showInputDialog("Digite o numero maior ou igual a 0: ");
        num = Integer.parseInt(numero);
                
        while(num<0){
         numero = JOptionPane.showInputDialog("nNumero negativo.Digite numero maior ou igual a 0: ");
         num = Integer.parseInt(numero);  
        }
         baseD = JOptionPane.showInputDialog("digite a base em deseja representa-lo(2-10): ");
         base = Integer.parseInt(baseD);
        while( base < 2 || base > 10){
         baseD = JOptionPane.showInputDialog("Nao sei converter.Digite a base em deseja representa-lo(2-10): ");
         base = Integer.parseInt(baseD);  
        }
        
        c = conv.converte(num, base);
        
        System.out.println("numero em decimal: "+ num);
        System.out.println("numero na base "+ base + ": " + c);

    }
}
