//Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.

package tarefa07;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Insira abaixo o primeiro valor.");
		float a = sc.nextFloat();
		System.out.println("Agora, digite o segundo valor.");
		float b = sc.nextFloat();
		System.out.println("Por último, digite o terceiro número");
		float c = sc.nextFloat();
		if (a > b) {
			if (b > c) {
				System.out.println("Os valores, em ordem crescente, são: " + c + " " + b + " " + a);
			} else if (c > a){
				System.out.println("Os valores, em ordem crescente, são: " + b + " " + a + " " + c);
		} else {
			System.out.println("Os valores, em ordem crescente, são: " + b + " " + c + " " + a);
		}
		} else {
			if (a > c) {
				System.out.println("Os valores, em ordem crescente, são: " + c + " " + a + " " + b);
			} else if (c > b) {
				System.out.println("Os valores, em ordem crescente, são: " + a + " " + b + " " + c);
			} else {
				System.out.println("Os valores, em ordem crescente, são: " + a + " " + c + " " + b);
			}
			
		}
		
		sc.close();
	}

	}

