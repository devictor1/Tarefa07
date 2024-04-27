/*Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não.
 * Para estar em condições, um dos seguintes requisitos deve ser satisfeito:

- Ter no mínimo 65 anos de idade.

- Ter trabalhado no mínimo 30 anos.

- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.

Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código),
o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade
e o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
 * 
 * 
 */

package tarefa07;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem-vindo! Digite abaixo o código do empregado:");
        int codigo = sc.nextInt();
        System.out.println("Digite o ano de nascimento do empregado:");
        int anoNascimento = sc.nextInt();
        System.out.println("Digite o ano em que o empregado entrou na empresa:");
        int anoIngresso = sc.nextInt();
        int idade = 2024 - anoNascimento;
        int tempoNaEmpresa = 2024 - anoIngresso;
        if (idade >= 65 || tempoNaEmpresa >= 30 || idade >= 60 && tempoNaEmpresa >=25) {
        	System.out.println("O funcionário de código " + codigo + " que tem " + idade + 
        			" anos e já trabalhou nesta empresa durante " + tempoNaEmpresa + " anos já pode requerer a aposentadoria");
        } else {
        	System.out.println("O funcionário de código " + codigo + " que tem " + idade + 
        			" anos e já trabalhou nesta empresa durante " + tempoNaEmpresa + " anos ainda não pode requerer a aposentadoria");
        }
        sc.close();

	}

}
