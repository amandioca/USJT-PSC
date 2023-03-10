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
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro valor:", "Terceiro Número", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " * " + num3 + " = " + (num1 * num2 * num3), "Resultado da multiplicação", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * b) Faça um programa que recebe as notas P1, P2 e P3 e exibe a média
     * considerando que a nota P1 tem peso 3, a nota P2 tem peso 3 e a nota P3
     * tem peso 4.
     *
     * @since 2023/03/09
     */
    public void exerc2() {
        double nota1, nota2, nota3;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a primeira nota", "Primeira Nota", JOptionPane.INFORMATION_MESSAGE));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a segunda nota:", "Segunda Nota", JOptionPane.INFORMATION_MESSAGE));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a terceira nota:", "Terceira Nota", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null, "Nota 1, peso 3: " + nota1
                + "\nNota 2, peso 3: " + nota2
                + "\nNota 3, peso 4: " + nota3
                + "\n\nMédia: " + ((nota1 * 3 + nota2 * 3 + nota3 * 4) / 10),
                "Resultado da Média", JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * c) Faça um programa que lê o salário atual de alguém e exibe o novo
     * salário que é o atual com 25% de aumento.
     *
     * @since 2023/03/09
     */
    public void exerc3() {
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o valor bruto atual do seu salário?", "Aumento Salarial", JOptionPane.INFORMATION_MESSAGE));

        // Aumento de 25%
        // 25 / 100 = 0.25
        // 1 + 0.25 = 1.25
        JOptionPane.showMessageDialog(null, "Com o aumento de 25% seu salário passará a ser:\nR$" + String.format("%.2f", salario *= 1.25), "Aumento Salarial", JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * d) Faça um programa que lê o salário base de alguém e exibe o novo
     * salário, considerando 5% de gratificação(mais dinheiro) e 7% de
     * impostos(menos dinheiro)sobre o salário base. Também exiba a gratificação
     * e o imposto.
     *
     * @since 2023/03/09
     */
    public void exerc4() {
        double salario, gratificacao, impostos;
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o valor bruto atual do seu salário?", "Cálculo de Pagamento", JOptionPane.INFORMATION_MESSAGE));

        gratificacao = (5 * salario) / 100;
        impostos = (7 * salario) / 100;

        JOptionPane.showMessageDialog(null, "Salario base: R$" + String.format("%.2f", salario)
                + "\nGratificação: R$" + String.format("%.2f", gratificacao)
                + "\nImpostos: R$" + String.format("%.2f", impostos)
                + "\n\nTotal a receber: R$" + String.format("%.2f", (salario + gratificacao) - impostos),
                "Cálculo de Pagamento", JOptionPane.INFORMATION_MESSAGE);

    }

}
