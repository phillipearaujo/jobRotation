package jobRotation.teste;

import java.util.Random;

public class Exercicio3 {

    /*
     * 
     * Dado um vetor que guarda o valor de faturamento diário de uma distribuidora,
     * faça um programa, na linguagem que desejar, que calcule e retorne:
     * • O menor valor de faturamento ocorrido em um dia do mês;
     * • O maior valor de faturamento ocorrido em um dia do mês;
     * • Número de dias no mês em que o valor de faturamento diário foi superior à
     * média mensal.
     * 
     */

    public static void main(String[] args) {

        // Obtem valores aleatórios devido o não recebimento do arquivo JSON/xml
        Random values = new Random();
        double dailyBilling[] = new double[30];

        for (int i = 0; i < dailyBilling.length; i++) {
            dailyBilling[i] = values.nextDouble(100 * 100);
            // System.out.printf("Faturamento diario: R$%.2f\n", dailyBilling[i]);
        }

        // Obtém o maior e menor valor de faturamento
        double lowerValue = dailyBilling[0];
        double biggerValue = dailyBilling[0];
        for (double value : dailyBilling) {
            if (value < lowerValue) {
                lowerValue = value;
            }
            if (value > biggerValue) {
                biggerValue = value;
            }
        }

        // Obtém a média de faturamento no período.
        double sumValues = 0.0;
        int workingDays = 0;
        for (double value : dailyBilling) {
            if (value > 0.0) {
                sumValues += value;
                workingDays++;
            }
        }
        double averageMonth = sumValues / workingDays;

        // Obtém o valor acima da média
        int overAverage = 0;
        for (double value : dailyBilling) {
            if (value > averageMonth) {
                overAverage++;
            }
        }

        System.out.printf("O menor valor de faturamento no período: R$%.2f\n", lowerValue);
        System.out.printf("O maior valor de faturamento no período: R$%.2f\n", biggerValue);
        System.out.printf("Dias com faturamento acima da média do período: %d", overAverage);

    }
}
