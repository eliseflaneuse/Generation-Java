package aula2;

import java.util.Scanner;

public class LacoCondicionalIf_exe2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número abaixo para saber mais!");
		System.out.println("Digite o número: ");
		num = leia.nextInt();
		
		if(num % 2 == 0 && num > 0) {
			System.out.println("O Número " + num + " é par e positivo!");
		}else if(num % 2 != 0 && num > 0){
			System.out.println("O Número " + num + " é ímpar e positivo!");
		}else if(num % 2 == 0 && num < 0) {
			System.out.println("O Número " + num + " é par e negativo!");
		}else if(num < 0 && num % 2 != 0) {
			System.out.println("O Número " + num + " é ímpar e negativo!");
		}else {
			System.out.println("Algo deu errado, tente novamente!");
		}

	}
	

}
