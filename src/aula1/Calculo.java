package aula1;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
	
		float n1, n2, n3, n4, calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o número 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o número 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o número 4: ");
		n4 = leia.nextFloat();
		
		calculo = (n1 * n2) - (n3 * n4);
		
		System.out.println("\nCálculo: " + calculo);
	}

}
