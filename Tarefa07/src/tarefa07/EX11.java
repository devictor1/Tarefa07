/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 * Maca: Até 5Kg: 2,5/kilo Acima de 5kg: 2,2/kilo
 * Maçã: Até 5Kg: 1,8/kilo Acima de 5kg: 1,5/kilo
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total
 * da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
 * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg)
 * de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */

package tarefa07;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Quantos quilos de Morango foram vendidos?");
		float quilosMorango = sc.nextFloat();

		System.out.println("E quantos foram vendidos de Maçã?");
		float quilosMaca = sc.nextFloat();
		
		float quilosTotal = quilosMorango + quilosMaca;
		if (quilosTotal < 8) {
		
		if (quilosMorango == 0) {
			System.out.println("Você não comprou nenhum morango!");
		} else if (quilosMorango <= 5) {
			float precoMorango = 2.5f;
			float gastoMorango = quilosMorango * precoMorango;
			System.out.println("Você gastou " + gastoMorango + " reais com morango!");
		} else {
			float precoMorango = 2.2f;
			float gastoMorango = quilosMorango * precoMorango;
			System.out.println("Você gastou " + gastoMorango + " reais com morango!");
		}
		if (quilosMaca == 0) {
			System.out.println("Você não comprou nenhuma maçã!");
		} else if (quilosMaca <= 5) {
			float precoMaca = 1.8f;
			float gastoMaca = quilosMaca * precoMaca;
			System.out.println("Você gastou " + gastoMaca + " reais com maçã!");
		} else {
			float precoMaca = 1.5f;
			float gastoMaca = quilosMaca * precoMaca;
			System.out.println("Você gastou " + gastoMaca + " reais com maçã!");
		}
		}else {
			if (quilosMorango == 0) {
				System.out.println("Você não comprou nenhum morango!");
			} else if (quilosMorango <= 5) {
				float precoMorango = 2.5f;
				float gastoMorango = quilosMorango * precoMorango * 0.9f;
				System.out.println("Você gastou " + gastoMorango + " reais com morango!");
			} else {
				float precoMorango = 2.2f;
				float gastoMorango = quilosMorango * precoMorango * 0.9f;
				System.out.println("Você gastou " + gastoMorango + " reais com morango!");
			}
			if (quilosMaca == 0) {
				System.out.println("Você não comprou nenhuma maçã!");
			} else if (quilosMaca <= 5) {
				float precoMaca = 1.8f;
				float gastoMaca = quilosMaca * precoMaca * 0.9f;
				System.out.println("Você gastou " + gastoMaca + " reais com maçã!");
			} else {
				float precoMaca = 1.5f;
				float gastoMaca = quilosMaca * precoMaca * 0.9f;
				System.out.println("Você gastou " + gastoMaca + " reais com maçã!");
			}
		}
		sc.close();

	}
}
