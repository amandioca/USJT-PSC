package saojudas.aulasti.ads.PSC.atividades;

import javax.swing.JOptionPane;

/**
 * Classe que contém os exercícios da atividade 1 de PSC.
 *
 * @author amandioca
 * @since 2023/03/03
 */
public class Atividade1 {

    /**
     * a) Faça um programa que recebe três números reais e exibe a multiplicação
     * desses números.
     *
     * @since 2023/03/05
     */
    public void exerc1() {
        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor:", "Primeiro Número", JOptionPane.INFORMATION_MESSAGE));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor:", "Segundo Número", JOptionPane.INFORMATION_MESSAGE));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor:", "Terceiro Número", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " * " + num3 + " = " + (num1 * num2 * num3), "Resultado da multiplicação", JOptionPane.INFORMATION_MESSAGE);
    }

}
