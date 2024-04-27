//Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

package tarefa07;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[3];

		System.out.println("Seja bem-vindo! Insira abaixo o primeiro valor!");
		numeros[0] = sc.nextInt();
		System.out.println("Agora, insira o segundo.");
		numeros[1] = sc.nextInt();
		System.out.println("Por último, o digite o terceiro número.");
		numeros[2] = sc.nextInt();
		
		double maior = numeros[2];
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		System.out.println("O maior número dos digitados é: " + maior);
		

		sc.close();
	}
	}


