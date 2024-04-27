/* Seja o seguinte algoritmo:

início

ler x

ler y

z <- (x*y) + 5

se z <= 0 então

resposta <- ‘A’

senão

se z <= 100 então

resposta <- ‘B’

senão

resposta <- ‘C’

fim_se

fim_se

escrever z, resposta

fim

Faça um teste de mesa e complete o quadro a seguir para os seguintes valores:

*/

package tarefa07;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Insira o valor de x.");
		int x = sc.nextInt();
		System.out.println("Agora, insira o valor de y.");
		int y = sc.nextInt();
		int z = (x * y) + 5;
		String resposta;
		if (z <= 0) {
			resposta = "A";
		} else if (z <= 100) {
			resposta = "B";
		} else {
			resposta = "C";
		}
		System.out.println(z + resposta);
		sc.close();
	}

}
/*
 * RESPOSTA: 
 * X			Y			Z			RESPOSTA
 * 3			2			11			B
 * 150			3			455			C
 * 7			-1			-2			A
 * -2			5			-5			A
 * 50			3			155			C
 */
