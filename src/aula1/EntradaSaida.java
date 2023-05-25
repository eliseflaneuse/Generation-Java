package aula1;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String nome;
		float distancia;
		float idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite a distância que correu essa semana: ");
		distancia = leia.nextFloat();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextFloat();
		
		System.out.println(idade + distancia);
		
		System.out.printf("\nSua distância percorrida: %.3f" , distancia);
		
		
	}

}
