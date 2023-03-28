package jobRotation.teste;

import java.util.Scanner;

public class Exercicio5 {

	/*
	 * 
	 * Escreva um programa que inverta os caracteres de um string.
	 * 
	 * IMPORTANTE:
	 * a) Essa string pode ser informada através de qualquer entrada de sua
	 * preferência ou pode ser previamente definida no código;
	 * b) Evite usar funções prontas, como, por exemplo, reverse;
	 * 
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = in.nextLine();

		String palavraInvertida = "";

		for (int i = palavra.length() - 1; i >= 0; i--) {
			palavraInvertida += palavra.charAt(i);
		}

		System.out.println("A palavra invertida é: " + palavraInvertida);

		in.close();
	}
}
