package vetoresMatrizes;

import java.util.Scanner;

public class Matrizes_exe2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double matrizNotas[][] = new double[10][4];
		double mediaFinal[] = new double[10];
		double soma = 0;
		int i = 0;
		
		// Ler as notas
		for (i = 0; i < matrizNotas.length; i++) {
            for (int j = 0; j < matrizNotas[i].length; j++) {
                System.out.println("Digite a nota para a alune " + (i + 1) + " no " + (j + 1) + "º bimestre: ");
                matrizNotas[i][j] = leia.nextDouble();
            }
        }
		
		// Somar as linhas e calcular a média 
		for (i = 0; i < matrizNotas.length; i++) {
            for (int j = 0; j < matrizNotas[i].length; j++) {
            	soma += matrizNotas[i][j];
            }
            mediaFinal[i] = soma / 4;
        }
		
		// Imprimir o 
        System.out.println("\nVetor das médias dos participantes: \n");
 
        for (i = 0; i < matrizNotas.length; i++) {
            System.out.println("Participante " + (i + 1) + ": " + mediaFinal[i]);
        }

        
        
		/*Para testar a matriz, se necessário:
		  for (int i = 0; i < matrizNotas.length; i++) {
            for (int j = 0; j < matrizNotas[i].length; j++) {
	            System.out.println("[" + i + "][" + j + "] : " + matrizNotas[i][j]);
	            
	            }
		}
		*/
	
	}
}
