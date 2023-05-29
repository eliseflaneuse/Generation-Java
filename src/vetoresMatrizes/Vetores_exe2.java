package vetoresMatrizes;

import java.util.Scanner;

public class Vetores_exe2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int soma = 0;
		double media = 0.0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número inteiro: ");
			vetor[i] = leia.nextInt();
			}
		
		// Imprimir elementos nos índices ímpares:
		System.out.println("Elementos nos índices ímpares:");
		
		for(int i = 1; i < vetor.length; i += 2) {
			System.out.println(vetor[i]);
		}
		
		// Imprimir os elementos do vetor que são números pares:
		System.out.println("\nElementos pares: ");
		
			for(int i = 0; i < vetor.length; i++) {
				if(vetor[i]%2==0) {
					System.out.println(vetor[i]);
				}
			}
		
		//Imprimir a soma de todos os elementos do vetor:
		System.out.println("\nSoma dos elementos do vetor: ");
		
			for(int i = 0; i < vetor.length; i++) {
				soma += vetor[i]; 
			}
		System.out.println(soma);
		
		//Imprimir a média de todos os elementos do vetor:
		System.out.println("\nMédia dos elementos do vetor: ");
			for(int i = 0; i < vetor.length; i++) {
					media = soma / vetor.length;
				}
		System.out.println(media);
	}

}
