package jobRotation.teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	/*
	 * Dado a sequ�ncia de Fibonacci, onde se inicia por 0 e 1 e o pr�ximo valor
	 * sempre ser� a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
	 * um n�mero, ele calcule a sequ�ncia de Fibonacci e retorne uma mensagem
	 * avisando se o n�mero informado pertence ou n�o a sequ�ncia.
	 * 
	 * IMPORTANTE:
	 * 
	 * Esse n�mero pode ser informado atrav�s de qualquer entrada de sua prefer�ncia
	 * ou pode ser previamente definido no c�digo;
	 * 
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
			System.out.printf("O número %d pertence a sequencia de Fibonacci.%n", numb);
		} else {
			System.out.printf("O número %d não pertence a sequencia de Fibonacci.%n", numb);
		}

		in.close();
	}
}
