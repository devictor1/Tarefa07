/*Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo
 * e escrever se formam ou não um triângulo. OBS: para formar um triângulo, o
 * valor de cada lado deve ser menor que a soma dos outros 2 lados.
 */

package tarefa07;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Insira abaixo o primeiro valor");
		float a = sc.nextInt();
		System.out.println("Obrigado! Agora insira o segundo valor");
		float b = sc.nextInt();
		System.out.println("Por último, insira o terceciro valor");
		float c = sc.nextInt();
		if (a + b > c && a + c > b && b + c > a && Math.abs(a - b) < c && Math.abs(a - c) < b && Math.abs(b - c) < a) {
			System.out.println("Esses três valores conseguem formar um triângulo!");
		} else {
			System.out.println("Infelizmente esses valores não podem formar um triângulo!");
		}
		sc.close();
	}

}
