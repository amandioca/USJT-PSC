package saojudas.aulasti.ads.PSC.atividades;

import java.time.LocalDate;
import java.time.LocalTime;
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

    /**
     * e) Faça um programa que exibe a área de um retângulo a partir da base e
     * da altura fornecidas pelo usuário.
     *
     * @since 2023/03/09
     */
    public void exerc5() {
        int b, h;

        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da base:", "Área do Retângulo", JOptionPane.INFORMATION_MESSAGE));
        h = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da altura:", "Área do Retângulo", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null, "Fórmula: A = b * h "
                + "\n\nA = " + b + " x " + h
                + "\nA = " + (b * h),
                "Área do Retângulo", JOptionPane.INFORMATION_MESSAGE
        );

    }

    /**
     * f) Faça um programa que exibe a área de um triângulo a partir da base e
     * da altura fornecidas pelo usuário.
     *
     * @since 2023/03/10
     */
    public void exerc6() {
        int b, h;

        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da base:", "Área do Triângulo", JOptionPane.INFORMATION_MESSAGE));
        h = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da altura:", "Área do Triângulo", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null, "Fórmula: A = b * h / 2 "
                + "\n\nA = " + b + " x " + h + " / 2"
                + "\nA = " + (b * h / 2),
                "Área do Triângulo", JOptionPane.INFORMATION_MESSAGE
        );

    }

    /**
     * g) Faça um programa que exibe a área de um círculo a partir da base e da
     * altura fornecidas pelo usuário.
     *
     * @since 2023/03/10
     */
    public void exerc7() {
        double p, raio;

        p = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do perímetro ou circunferência do círculo:", "Área do Círculo", JOptionPane.INFORMATION_MESSAGE));

        //  P = (2 * Math.PI) * raio;
        raio = p / (2 * Math.PI);

        JOptionPane.showMessageDialog(null, "Fórmula: A = π * r ^ 2 "
                + "\n\nA = π * " + String.format("%.2f", (raio = p / (2 * Math.PI))) + " ^ 2"
                + "\nA = " + String.format("%.2f", 3.14 * raio * raio),
                "Área do Círculo", JOptionPane.INFORMATION_MESSAGE
        );

    }

    /**
     * h) Faça um programa que exibe quantos litros de combustível são gastos
     * por um carro em um dado percurso. Serão fornecidos pelo usuário a
     * distância percorrida em km e a quantidade de listros gastos por km.
     *
     * @since 2023/03/10
     */
    public void exerc8() {
        double percurso, litroKm;

        percurso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a distância do percurso:", "Litros Gastos", JOptionPane.INFORMATION_MESSAGE));
        litroKm = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quantos litros são gastos por KM:", "Litros Gastos", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null, "O total de litros gastos no percurso:\n" + (percurso * litroKm),
                "Litros Gastos", JOptionPane.INFORMATION_MESSAGE
        );

    }

    /**
     * i) Faça um programa que a partir da idade atual e o ano atual, calcule e
     * exiba a idade que a pessoa teria na virada do próximo século.
     *
     * @since 2023/03/11
     */
    public void exerc9() {
        LocalDate hoje = LocalDate.now();

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade atual?", "Minha Idade em 2100", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null, "Sua idade na virada do século será:\n" + (2100 - hoje.getYear() + idade),
                "Minha Idade em 2100", JOptionPane.INFORMATION_MESSAGE
        );

    }

    /**
     * j) Faça um programa que recebe duas notas e exibe a média ponderada
     * dessas notas, considerando peso dois para a primeira e peso três para a
     * segunda.
     *
     * @since 2023/03/11
     */
    public void exerc10() {
        double nota1, nota2;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a primeira nota", "Primeira Nota", JOptionPane.INFORMATION_MESSAGE));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a segunda nota:", "Segunda Nota", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null, "Nota 1, peso 2: " + nota1
                + "\nNota 2, peso 3: " + nota2
                + "\n\nMédia: " + ((nota1 * 2 + nota2 * 3) / 5),
                "Média Ponderada", JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * k) Um funcionário recebe um salário fixo acrescido de 4% de comissão
     * sobre suas vendas. Faça um programa que recebe o salário fixo e a soma de
     * tudo que ele vendeu, e mostre a comissão e o salário final do
     * funcionário.
     *
     * @since 2023/03/11
     */
    public void exerc11() {
        double salario, totalVendas;
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o valor do seu salário?", "Comissão", JOptionPane.INFORMATION_MESSAGE));
        totalVendas = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual valor total das suas vendas esse mês?", "Comissão", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null, "Comissão: R$" + String.format("%.2f", (4 * totalVendas) / 100)
                + "\nTotal a receber: R$" + String.format("%.2f", salario + ((4 * totalVendas) / 100)),
                "Comissão", JOptionPane.INFORMATION_MESSAGE);

    }

}
