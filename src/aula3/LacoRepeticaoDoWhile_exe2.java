package aula3;

import java.util.Scanner;

public class LacoRepeticaoDoWhile_exe2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        int numero, soma = 0, quantidade = 0;

        do {
            System.out.print("Digite um número inteiro (0 para sair): ");
            numero = leia.nextInt();

            if (numero != 0 && numero % 3 == 0) {
                soma += numero;
                quantidade++;
            }
        } while (numero != 0);

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("\nA média dos números múltiplos de 3 é: " + media);
        } else {
            System.out.println("\nNenhum número múltiplo de 3 foi digitado.");
        }

	}

}
