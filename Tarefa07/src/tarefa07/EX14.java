/*Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a
 * média dos exercícios que fazem parte da avaliação. Calcular a média de aproveitamento,
 * usando a fórmula abaixo e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
 * 
 * Media = (N1 + N2*2 + N3*3 + Media_Dos_Exerc.) /7
 * 
 * A atribuição de conceitos obedece a tabela abaixo:
 * >= 9				A
 * >= 7,5 e < 9		B
 * >= 6 e < 7,5		C
 * < 6 				D
 * 
*/
package tarefa07;

import java.util.Scanner;

public class EX14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Qual sua nota na prova N1?");
		float n1 = sc.nextFloat();
		System.out.println("E como você foi na N2?");
		float n2 = sc.nextFloat();
		System.out.println("E quanto você tirou na N3?");
		float n3 = sc.nextFloat();
		System.out.println("Por último, qual sua média dos exercícios?");
		float mediaExercicios = sc.nextFloat();
		
		double media = ((n1 + (n2*2) + (n3*3) + mediaExercicios) / 7);
		if (media >= 9) {
			System.out.println("Parabéns! Você passou com média " + media + " e conceito A!");
		}else if (media >= 7.5f) {
			System.out.println("Parabéns! Você passou com média " + media + " e conceito B!");
		} else if (media >= 6) {
			System.out.println("Parabéns! Você passou com média " + media + " e conceito C!");
		} else {
			System.out.println("Poxa, infelizmente você não passou com sua média " + media + " e conceito D. :(");
		}
			
		
		
		sc.close();
	}

}
