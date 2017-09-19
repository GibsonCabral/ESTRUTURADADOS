/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaindex;

import java.util.Scanner;

public class Adaindex {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int tamX;
        int tamY;
        
        tamX = input.nextInt();
        tamY = input.nextInt();
        
        String [] lista = new String [tamX];
        for (int i=0;i<tamX;i++){
           
            lista[i] = input.next();
            
        }
       
        String [] compara = new String[tamY];
        for (int i=0;i<tamY;i++){
            compara[i] = input.next();
            
        }
        for (int i=0;i<tamY;i++){
            String nome;
            nome=compara[i];
            Pref(nome,lista);
        }
    }
    public static void Pref(String n,String ar[]){
        int contador = 0;
        for (String ar1 : ar) {
            if (ar1.startsWith(n)) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}