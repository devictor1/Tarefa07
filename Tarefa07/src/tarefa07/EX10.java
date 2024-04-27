/* Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
 * (considere que as idades dos homens serão sempre diferentes entre si,
 * bem como as das mulheres). Calcule e escreva a soma das idades do
 * homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.
 */

package tarefa07;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] homens = new int[2];
		int[] mulheres = new int[2];

		System.out.println("Seja bem-vindo! Insira abaixo a idade do primeiro homem!");
		homens[0] = sc.nextInt();
		System.out.println("Por favor insira a idade do segundo.");
		homens[1] = sc.nextInt();

		System.out.println("Agora, digite a idade da primeira mulher.");
		mulheres[0] = sc.nextInt();
		System.out.println("E por último, a idade da segunda.");
		mulheres[1] = sc.nextInt();

		double maiorH = homens[0];
		double maiorH2 = homens[1];

		if (maiorH2 > maiorH) {
			double temp = maiorH;
			maiorH = maiorH2;
			maiorH2 = temp;
		}
		double maiorM = mulheres[0];
		double maiorM2 = mulheres[1];

		if (maiorM2 > maiorM) {
			double temp = maiorM;
			maiorM = maiorM2;
			maiorM2 = temp;
		}
		double soma = maiorH + maiorM2;
		double produto = maiorH2 * maiorM;
		System.out.println("A soma da maior idade dos homens com a menor idade das mulheres é " + soma);
		System.out.println("O produto da menor idade dos homens com a maior idade das mulheres é " + produto);
		

		sc.close();

	}
}
