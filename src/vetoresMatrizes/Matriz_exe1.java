package vetoresMatrizes;

import java.util.Scanner;

public class Matriz_exe1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
        
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um valor para a posição [" + i + "][" + j + "]: ");
                matrizInteiros[i][j] = leia.nextInt();
            }
        }
		
		// Imprimir todos os elementos da Diagonal Principal
		System.out.println("\nElementos da Diagonal Principal:");
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
				if (i == j) {
					System.out.println(matrizInteiros[i][j]);
					somaPrincipal += matrizInteiros[i][j];
				}
			}
		}	
		
		// Imprimir todos os elementos da Diagonal Secundária
		System.out.println("\nElementos da Diagonal Secundária:");
		for (int l = matrizInteiros.length - 1; l >= 0; l--) {      
			System.out.println(matrizInteiros[l][matrizInteiros.length - 1 - l]);
			somaSecundaria += matrizInteiros[l][matrizInteiros.length - 1 - l];
		}	
		
		//Soma das Diagonais
		System.out.println("\nSoma dos Elementos da Diagonal Principal:");
		System.out.println(somaPrincipal);
		System.out.println("\nSoma dos Elementos da Diagonal Principal:");
		System.out.println(somaSecundaria);
		
	}
}
