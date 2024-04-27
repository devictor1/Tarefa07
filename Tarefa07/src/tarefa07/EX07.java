/*Ler dois valores e imprimir uma das três mensagens a seguir:

‘Números iguais’, caso os números sejam iguais

‘Primeiro é maior’, caso o primeiro seja maior que o segundo;

‘Segundo maior’, caso o segundo seja maior que o primeiro.
*/



package tarefa07;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Digite abaixo o primeiro número!");
		float num1 = sc.nextInt();
		System.out.println("Agora, insira o segundo valor");
		float num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("Primeiro é maior");
		} else if (num2 > num1) {
			System.out.println("Segundo é maior");
		} else {
			System.out.println("Números iguais");
		}

		sc.close();

	}

}
