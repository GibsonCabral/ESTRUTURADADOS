/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasequencialed;

import java.util.Scanner;

/**
 *
 * @author Gustavo Gibson
 */
public class ListaSequencialED {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tamX = 0;
        tamX = input.nextInt();
        int[] X = new int[tamX];

        for (int i = 0; i < tamX; i++) {
            X[i] = input.nextInt();
        }

        int tamY = 0;
        tamY = input.nextInt();

        int[] Y = new int[tamY];
        for (int i = 0; i < tamY; i++) {
            Y[i] = input.nextInt();

        }
        for (int i = 0; i < tamX; i++) {
            if (!search(X[i], Y)) {
                String cout = (i != (X.length - 1)) ? X[i] + " " : X[i] + "";

                System.out.print(cout);
            }
        }
    }

    public static boolean search(int dado, int ar[]) {
        int i;
        for (i = 0; i < (ar.length); i++) {

            if (ar[i] == dado) {
                return true;
            }

        }

        return false;
    }
}
