/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeorder;

import java.util.Scanner;

/**
 *
 * @author Gustavo Gibson
 */
public class TREEORDER {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int qtd = input.nextInt();
        int no = 0;
        int count = 0;
        
        int[] aux = new int[2];
        
        for(int i = 0; i < 3; i++) //Varre linhas
        {
        for (int x = 0; x < qtd; x++){
            
            no = input.nextInt();
            if(i == 0 && x == 0){ 
                aux[0] = no;
            }

            if(i==0 && x == qtd-1) {
                //1 arv
                aux[1] = no;
            }

            if((i==1 && x == qtd-1) && aux[0] == no) {
                //2 arv
               count++;
            }

            if(i == 2 && x == qtd-1 && aux[1] == no) {
                //3 arv
                count++;
            }
        }
    }
        if(count == 2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
 
}
    

