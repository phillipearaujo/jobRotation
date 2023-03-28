package jobRotation.teste;

public class Exercicio4 {

    /*
     * 
     * Dado o valor de faturamento mensal de uma distribuidora, detalhado por
     * estado:
     * 
     * SP – R$67.836,43
     * RJ – R$36.678,66
     * MG – R$29.229,88
     * ES – R$27.165,48
     * Outros – R$19.849,53
     * 
     * Escreva um programa na linguagem que desejar onde calcule o percentual de
     * representação que cada estado teve dentro do valor total mensal da d
     * stribuidora.
     * 
     */

    public static void main(String[] args) {

        String[] unit = { "SP", "RJ", "MG", "ES", "Outros" };
        double[] unitInvoicing = { 67836.43, 36678.66, 29229.88, 27165.48, 19849.53 };

        double totalInvoicing = 0.0;
        for (double value : unitInvoicing) {
            totalInvoicing += value;
        }

        for (int i = 0; i < unit.length; i++) {
            double percentage = unitInvoicing[i] / totalInvoicing * 100.0;
            System.out.printf("%s => %.2f%%\n", unit[i], percentage);
        }

    }
}
