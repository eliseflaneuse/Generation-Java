package collectionQueue;

import java.util.Scanner;
import java.util.Stack;

public class ListStack_exe1 {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("\n************************************************************");
			System.out.println();
			System.out.println("\t1 - Adicionar um novo livro na pilha.");
			System.out.println("\t2 - Listar todos os livros");
			System.out.println("\t3 - Retirar um livro da pilha ");
			System.out.println("\t0 - Sair");
			System.out.println();
			System.out.println("************************************************************");
			System.out.println("Entre com a opção desejada:");
			
			num = leia.nextInt();
			leia.nextLine(); //   utilizada para limpar o buffer de entrada
			
			switch (num) {
			case 1:
				System.out.print("Digite o nome do Livro: ");
				String nome = leia.nextLine();
				pilha.push(nome);
				System.out.println();
				System.out.println("Pilha: \n");
				 for (String livro : pilha) {
                     System.out.println("\t" + livro);
                 }
				System.out.println("\nLivro adicionado!\n");
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("Não existe pilha, vá comprar mais livros!");
				} else {
					System.out.println("\nLivros na Pilha: \n");
					for (String livro : pilha) {
	                     System.out.println("\t" + livro);
	                 }
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("Não existe pilha, vá comprar mais livros!");
				} else {
					System.out.println("\nPilha: ");
					String livro = pilha.pop();
					System.out.println("\no" + livro + " foi retirado da pilha!");
				}
				break;
			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
			
		} while(num != 0);

	}

}
