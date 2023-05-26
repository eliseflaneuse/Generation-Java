package aula3;

import java.util.Scanner;

public class LacoRepeticaoDoWhile_exe1 {

	public static void main(String[] args) {
		
		int numero, soma = 0;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\nDigite um número inteiro (digite 0 para finalizar): ");
            numero = leia.nextInt();
            if (numero > 0) {
            	soma = soma + numero;
            }

        } while (numero != 0);
        
        System.out.println("\nA soma dos números positivos é: " + soma);
        
	}

}
