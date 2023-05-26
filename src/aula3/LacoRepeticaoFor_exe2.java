package aula3;

import java.util.Scanner;

public class LacoRepeticaoFor_exe2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int i, num, par = 0, impar = 0;
		
		for (i = 0; i<10; i++) {
			System.out.println("Digite o " + (i +1) + "º número: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("\nTotal de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);

	}

}
