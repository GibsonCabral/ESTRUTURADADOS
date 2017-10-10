package onped;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Gustavo Gibson
 */
public class OnpED {

    static String transExpressao(String infix) {

        final String operacoes = "-+/*^";
       
        StringBuilder string;
        
        /*A classe StringBuilder permite criar e manipular dados de 
        Strings dinamicamente, ou seja, podem criar variáveis de 
        String modificáveis.*/
        
        string = new StringBuilder();
        Stack<Integer> x;
        x = new Stack<>();

        for (String recebe : infix.split("\\s*")) {
            if (recebe.isEmpty()) {
                continue;
            }
            char c = recebe.charAt(0);
            /*Aceita um argumento inteiro - 0 - que representa o índice e retorna o caractere 
            nessa posição no StringBuilder;*/
            int index = operacoes.indexOf(c);
            //serve para sabermos qual índice de uma parte da string corresponde//
            int p1 = index / 2; 
            int p2 = x.peek() / 2;
             
            
            if (index != -1) {
                if (x.isEmpty()) {
                    x.push(index);
                } else {
                    while (!x.isEmpty()) {
                        
                        if (p2 > p1 || (p2 == p1 && c != '^')) {
                            string.append(operacoes.charAt(x.pop())).append("");
                        } else {
                            break;
                        }
                    }
                    x.push(index);
                }
            } else if (c == '(') {
                x.push(-2);
            } else if (c == ')') {
                    while (x.peek() != -2)/*verifica sem remover*/ {
                    string.append(operacoes.charAt(x.pop())).append("");
                }
                x.pop()/*Remove o objeto do topo da pilha e retorna como valor*/;
            } else {
                string.append(recebe).append("");
            }
        }
        while (!x.isEmpty()) {
            string.append(operacoes.charAt(x.pop())).append("");
        }
        return string.toString();
    }

    public static void main(String[] args) throws java.lang.Exception {
        String entrada;
        Scanner procura1 = new Scanner(System.in);
        Scanner procura2 = new Scanner(System.in);
        
        int aux1;
        String aux2;
        String tentativa = null;
        aux1 = procura2.nextInt();
        if (aux1 <= 100) {
            String salva[] = new String[aux1];
            for (int i = 0; i < aux1; i++) {

                aux2 = procura1.nextLine();
                if (aux2.length() <= 400) {
                    salva[i] = aux2;
                }

            }
            for (int i = 0; i < aux1; i++) {
                entrada = salva[i];
                System.out.printf("%s%n", transExpressao(entrada));;
            }
        }
    }
}
