package aula3;

import java.util.Scanner;

public class LacoRepeticaoFor_exe1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1, num2, numR;
		
		System.out.println("Digite um número: ");
		num1 = leia.nextInt();
		System.out.println("Digite um número maior que o anterior: ");
		numR = leia.nextInt();
		
		if(numR > num1) {
			num2 = numR;
			System.out.println("No Intervalo entre " + num1 + " e " + num2 + " : \n");
			for(int i = num1; i < num2; i++) {
				if(i%3 == 0 && i%5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		} else if (numR < num1) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.println("Por favor, verifique o valor inserido e tente novamente.");
		}
		
		
	}

}
