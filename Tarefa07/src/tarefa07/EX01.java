//Ler um valor e escrever se é positivo, negativo ou zero.

package tarefa07;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Digite abaixo um número!");
		double num = sc.nextDouble();
		if (num < 0) {
			System.out.println("O valor digitado é negativo!");
		} else if (num == 0) {
			System.out.println("O valor digitado é zero!");
		} else {
			System.out.println("O valor digitado é positivo!");
		}
		sc.close();
	}

}
