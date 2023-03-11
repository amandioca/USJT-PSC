package saojudas.aulasti.ads.PSC;

import java.util.Scanner;

/**
 * Aula 4 - Exemplo Scanner
 *
 * @author amandioca
 * @since 2023/03/11
 */
public class Aula4 {

    /**
     * Execução alternativa do Exercício B da Atividade 1 utilizando o Scanner:
     * b) Faça um programa que recebe as notas P1, P2 e P3 e exibe a média
     * considerando que a nota P1 tem peso 3, a nota P2 tem peso 3 e a nota P3
     * tem peso 4.
     *
     * @since 2023/03/11
     */
    public static void main(String[] args) {
        double nota1, nota2, nota3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira as três notas:");

        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();
        scan.close();
        
        System.out.println("\nNota 1, peso 3: " + nota1
                + "\nNota 2, peso 3: " + nota2
                + "\nNota 3, peso 4: " + nota3
                + "\n\nMédia Ponderada: " + ((nota1 * 3 + nota2 * 3 + nota3 * 4) / 10));

    }

}
