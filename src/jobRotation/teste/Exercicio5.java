package jobRotation.teste;

import java.util.Scanner;

public class Exercicio5 {

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
