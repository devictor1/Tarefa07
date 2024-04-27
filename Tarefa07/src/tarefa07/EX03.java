//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores

package tarefa07;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[3];

		System.out.println("Seja bem-vindo! Insira abaixo o primeiro valor!");
		numeros[0] = sc.nextDouble();
		System.out.println("Agora, insira o segundo.");
		numeros[1] = sc.nextDouble();
		System.out.println("Por último, o digite o terceiro número.");
		numeros[2] = sc.nextDouble();

		double maior = numeros[0];
		double maior2 = numeros[1];
		
		 if (maior2 > maior) {
	            double temp = maior;
	            maior = maior2;
	            maior2 = temp;
	        }
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior2 = maior;
				maior = numeros[i];
			}else if (numeros[i] > maior2 && numeros[i] != maior) {
				maior2 = numeros[i];
			}

		}
		System.out.println("A soma dos dois maiores números digitados é " + (maior + maior2));

		sc.close();

	}

}
