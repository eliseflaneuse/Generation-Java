package aula2;

import java.util.Scanner;

public class LacoCondicionalIf_exe3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		String input;
		int idade;
		boolean primeiraDoacao;
		
		// Idades mínima e máxima - para fácil modificação caso as regras para doação mudem
		final int IdadeMin = 60;
		final int IdadeMax = 69;
		
		System.out.println("Digite seus dados a seguir para verificar se esta apto para doar sangue: ");
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		leia.nextLine(); // Consumir a quebra de linha pendente

		System.out.println("Primeira doação de sangue? Digite sim ou não! ");
		input = leia.nextLine();
	
        if (input.equalsIgnoreCase("sim")) {
        	primeiraDoacao = true;
        } else if (input.equalsIgnoreCase("não")) {
        	primeiraDoacao = false;
        } else {
            System.out.println("Entrada inválida. Utilize apenas 'sim' ou 'não'.");
            return;
        };
		
		if(idade < 18) {
			System.out.println(nome + " não está apte para doar sangue!");
		}else if(idade > 18 && idade < IdadeMin) {
			System.out.println(nome + " está apte para doar sangue!");
		}else if(idade >= IdadeMin && idade <= IdadeMax) {
			if(primeiraDoacao == true) {
				System.out.println(nome + " não está apte para doar sangue!");
			}else if(primeiraDoacao == false) {
				System.out.println(nome + " está apte para doar sangue!");
			}
		}else if(idade > IdadeMax) {
			System.out.println("Checar com o médico se a doação é possível.");
		}else {
			System.out.println("Algum erro ocorreu, favor tentar novamente.");
		}
		
	}

}
