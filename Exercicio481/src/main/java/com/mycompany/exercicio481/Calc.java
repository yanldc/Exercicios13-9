/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio481;

/**
 *
 * @author yan-l
 */
public class Calc {
     int converte(int nnum, int nbase) {
        int nb = 0;
        int r, b = 0;
        
        while (nnum >= nbase) {
            r = nnum % nbase;
            nb = nb + (int) (Math.pow(10, b) * r);
            nnum = nnum / nbase;
            b++;
        }
        
        nb = nb + (int) (Math.pow(10, b) * nnum);
        return nb;
    }
}
