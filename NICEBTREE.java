/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicebtree;

import java.util.Scanner;

/**
 *
 * @author Gustavo Gibson
 */
public class NICEBTREE {

    public static int i;
    public static char[] ar = new char[1001];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int qtd = input.nextInt();
        while (qtd > 0) {
            String string = input.next();
            ar = string.toCharArray();
            i = 0;
            System.out.println(lenght() - 1);
            qtd--;
        }
    }

    public static int lenght() {
        if (ar[i++] == 'l') {
            return 1;
        } else {
            return max(lenght(), lenght()) + 1;
        }
    }

    public static int max(int max1, int max2) {
        if (max1 > max2) {
            return max1;
        } else {
            return max2;
        }
    }
}
