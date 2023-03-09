package saojudas.aulasti.ads.PSC;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Aula 3
 *
 * @author amandioca
 * @since 2023/03/03
 */
public class Aula3 {

    /**
     * 1) Faça um programa que recebe dois números inteiros e exibe o resultado
     * das quatro operações aritméticas.
     *
     * @since 2023/03/03
     */
    public static void main(String[] args) {

        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor:", "Primeiro Número", JOptionPane.INFORMATION_MESSAGE));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor:", "Segundo Número", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2), "Resultado da soma", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2), "Resultado da subtração", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + (num1 * num2), "Resultado da multiplicação", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + (num1 / num2), "Resultado da divisão", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Estudo de execução alternativa ao exercício 1
     *
     * @since 2023/03/05
     */
    public void exercAlternativo1() {
        String opcoes[] = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        int continuar, opcao, num1, num2;

        do {
            opcao = JOptionPane.showOptionDialog(null,
                    "Selecione uma das opções:",
                    "Seleção",
                    JOptionPane.NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    null);
            try {
                num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor:", opcoes[opcao], JOptionPane.INFORMATION_MESSAGE));
                num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor:", opcoes[opcao], JOptionPane.INFORMATION_MESSAGE));
            } catch (HeadlessException | NumberFormatException e) {
                num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, informe novamente o primeiro valor:", opcoes[opcao], JOptionPane.WARNING_MESSAGE));
                num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, informe novamente o segundo valor:", opcoes[opcao], JOptionPane.WARNING_MESSAGE));
            }

            switch (opcao) {
                case 0 ->
                    JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2), opcoes[opcao], JOptionPane.INFORMATION_MESSAGE);
                case 1 ->
                    JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2), opcoes[opcao], JOptionPane.INFORMATION_MESSAGE);
                case 2 ->
                    JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + (num1 * num2), opcoes[opcao], JOptionPane.INFORMATION_MESSAGE);
                case 3 ->
                    JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + (num1 / num2), opcoes[opcao], JOptionPane.INFORMATION_MESSAGE);
            }

            continuar = JOptionPane.showConfirmDialog(null, "Deseja fazer um novo cálculo?", "Seleção", JOptionPane.INFORMATION_MESSAGE);
        } while (continuar == 0);

    }

}
