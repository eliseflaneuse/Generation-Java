package vetoresMatrizes;

import java.util.Scanner;

public class vetores_exe1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numPesquisa;
		int index = -1;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numPesquisa = leia.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numPesquisa) {
                index = i;
            }
        }

        if (index != -1) {
            System.out.println("\nO número " + numPesquisa + " está localizado no index: " + index + ".");
        } else {
            System.out.println("\nO número " + numPesquisa + " não foi encontrado!");
        }
	}

}
