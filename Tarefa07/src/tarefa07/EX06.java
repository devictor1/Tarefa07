/*Ler o nome de 2 times e o número de gols marcados na partida(para cada time). Escrever o
 * nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
 */

package tarefa07;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Digite abaixo o nome do primeiro time!");
		String time1 = sc.next();
		System.out.println("E quantos gols esse time marcou?");
		int golsTime1 = sc.nextInt();
		System.out.println("Entendido, e qual o nome do segundo time?");
		String time2 = sc.next();
		System.out.println("E quantos gols foram marcados pelo " + time2 + " ?");
		int golsTime2 = sc.nextInt();
		if (golsTime1 > golsTime2) {
			System.out.println("O " + time1.toUpperCase() + " É O GRANDE VENCEDOR!!!!");
		} else if (golsTime2 > golsTime1) {
			System.out.println("O " + time2.toUpperCase() + " É O GRANDE VENCEDOR!!!!");
		} else {
			System.out.println("EMPATE!");
		}

		sc.close();
	}

}
