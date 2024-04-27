/*Escreva um algoritmo que leia o número de litros vendidos e o
 * tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina),
 * calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço
 * do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
 */

package tarefa07;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Quantos litros de combustível foram vendidos?");
		while (!sc.hasNextDouble()) {
			System.out.println("Por favor, insira um número válido.");
			sc.next();
		}
		double x = sc.nextDouble();
		sc.nextLine();

		System.out.println("E qual foi o tipo de combustível? Use A para álcool e G para gasolina");
		String input = sc.nextLine();
		
		if (input.length() == 1) {
			char tipoCombustivel = input.toUpperCase().charAt(0);
			double precoAlcool = 2.90;
			double precoGasolina = 3.30;
			double valorTotal = 0;

			if (tipoCombustivel == 'A') {
				valorTotal = x * precoAlcool * (x <= 20 ? 0.97 : 0.95);
				System.out.println("O valor pago no Álcool foi " + valorTotal + " reais.");
			} else if (tipoCombustivel == 'G') {
				valorTotal = x * precoGasolina * (x <= 20 ? 0.96 : 0.94);
				System.out.println("O valor pago na Gasolina foi " + valorTotal + " reais.");
			} else {
				System.out.println("Entrada inválida para o tipo de combustível.");
			}

			sc.close();
		}
	}
}
