/*Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário.
 * Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a
 * pagar (total a pagar = total - desconto), sabendo-se que:

- Se quantidade <= 5 o desconto será de 2%

- Se quantidade > 5 e quantidade <=10 o desconto será de 3%

- Se quantidade > 10 o desconto será de 5%
*/

package tarefa07;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Por favor insira abaixo o nome do seu produto");
		String produto = sc.next();
		System.out.println("Obrigado! Quantos(as) " + produto + "s você comprou?");
		int quantidade = sc.nextInt();
		System.out.println("Maravilhoso! Qual o valor unitário desse produto?");
		float preco = sc.nextFloat();
		
		float valorTotal = quantidade * preco;
		
		if (quantidade <= 5) {
			float desconto = valorTotal * 0.02f;
			float valorFinal = valorTotal * 0.98f;
			System.out.println("Obrigado, o total ficaria em " + valorTotal + " reais, mas com o desconto de "+ desconto
					+ " reais ficou no total de " + valorFinal + " reais");
		}else if (quantidade <= 10) {
			float desconto = valorTotal * 0.03f;
			float valorFinal = valorTotal * 0.97f;
			System.out.println("Obrigado, o total ficaria em " + valorTotal + " reais, mas com o desconto de "+ desconto
				+ " reais ficou no total de " + valorFinal + " reais");
		} else {
			float desconto = valorTotal * 0.05f;
			float valorFinal = valorTotal * 0.95f;
			System.out.println("Obrigado, o total ficaria em " + valorTotal + " reais, mas com o desconto de "+ desconto
				+ " reais ficou no total de " + valorFinal + " reais");
		}
		sc.close();
	}

}
