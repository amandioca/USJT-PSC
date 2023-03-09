package saojudas.aulasti.ads.PSC;

import javax.swing.JOptionPane;

/**
 * Aula 2 - Tipos de variaveis: tipos simples e complexos, como declarar e
 * atribuir valor a variaveis de diferentes tipos de dado e JOptionPane
 * (biblioteca java)
 *
 * @author amandioca
 * @since 2023/02/27
 */
public class Aula2 {

    public static void main(String[] args) {

        // Numero inteiro
        int varInt = 3456, idade = 0;
        // Numero com casas decimais
        double varDouble = 34.233445;
        // Caracter unico
        char opcao = 'a';
        // Verdadeiro ou falso
        boolean ePresente = false; // false por default

        // Texto
        String nome = "Amanda Amorim";

        JOptionPane.showMessageDialog(null, "Valor da minha variável do tipo int: " + varInt);
        JOptionPane.showMessageDialog(null, "Valor da minha variável do tipo double: " + varDouble);
        JOptionPane.showMessageDialog(null, "Meu nome é: " + nome, "Exemplo", JOptionPane.INFORMATION_MESSAGE);
    }

}
