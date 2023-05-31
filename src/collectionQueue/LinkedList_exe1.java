package collectionQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LinkedList_exe1 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Scanner leia = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("\n************************************************************");
			System.out.println();
			System.out.println("\t1 - Adicionar Cliente na Fila");
			System.out.println("\t2 - Listar Todos os Clientes");
			System.out.println("\t3 - Retirar Clientes da Fila");
			System.out.println("\t0 - Sair");
			System.out.println();
			System.out.println("************************************************************");
			System.out.println("Entre com a opção desejada:");
			
			num = leia.nextInt();
			leia.nextLine(); //   utilizada para limpar o buffer de entrada
			
			switch (num) {
			case 1:
				System.out.print("Digite o nome do Cliente: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println();
				System.out.println("Fila: \n");
				 for (String cliente : fila) {
                     System.out.println("\t" + cliente);
                 }
				System.out.println("\nCliente adicionado!\n");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("\nLista de Clientes na Fila: \n");
					for (String cliente : fila) {
	                     System.out.println("\t" + cliente);
	                 }
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					String clienteChamado = fila.poll();
					System.out.println("\nFila:" + "\t" + clienteChamado + "\n\n O Cliente foi Chamado!");
				}
				break;
			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (num != 0);

		leia.close();
	}
}
