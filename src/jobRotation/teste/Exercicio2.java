package jobRotation.teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	/*
	 * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
	 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
	 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
	 * avisando se o número informado pertence ou não a sequência.
	 * 
	 * IMPORTANTE:
	 * 
	 * Esse número pode ser informado através de qualquer entrada de sua preferência
	 * ou pode ser previamente definido no código;
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numb = in.nextInt();

		int a = 0, b = 1;
		ArrayList<Integer> fibonacci = new ArrayList<>();
		fibonacci.add(a);
		fibonacci.add(b);
		
		for (int i = 1; fibonacci.get(i) < numb; i++) {
            int proximo = a + b;
            fibonacci.add(proximo);
            a = b;
            b = proximo;
            System.out.println(proximo);
        }
		
		if (fibonacci.contains(numb)) {
            System.out.printf("O número %d pertence à sequência de Fibonacci.%n", numb);
        } else {
            System.out.printf("O número %d não pertence à sequência de Fibonacci.%n", numb);
        }
		
		in.close();
	}
}
