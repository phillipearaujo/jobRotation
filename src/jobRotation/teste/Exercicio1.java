package jobRotation.teste;

public class Exercicio1 {

	/*
	 * int INDICE = 13, SOMA = 0, K = 0;
	 * enquanto K < INDICE faça
	 * {
	 * K = K + 1;
	 * SOMA = SOMA + K;
	 * }
	 * imprimir(SOMA);
	 */
	
	public static void main(String[] args) {
		
		int indice = 13;
		int soma = 0, k = 0;
		
		while (k < indice) {
			k++;
			soma += k;
			}

		System.out.println(soma);
	}
}
