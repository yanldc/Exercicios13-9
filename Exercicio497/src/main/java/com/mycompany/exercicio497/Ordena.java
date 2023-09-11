/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio497;

/**
 *
 * @author yan-l
 */
public class Ordena {
    int busca(int[] vet, int tam, int chave){
    int i, ini, meio, fim, n;
    ini=0;
    fim= tam-1;
    
    while(ini<= fim){
        meio=(ini + fim)/ 2;
        if(chave == vet[meio]){
            return(meio);
        }else if(chave < vet[meio]){
            fim= meio-1;
        }else{
            ini= meio+1;
        }
    }
    meio=-1;
    return(meio);
}
    void ordena(int[] vet, int tam){
        int l1, c1, aux;
        
        for(l1=0; l1<tam; l1++){
            for(c1=l1+1; c1<tam; c1++){
                if(vet[l1] > vet[c1]){
                    aux=vet[l1];
                    vet[l1]= vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
    
}
