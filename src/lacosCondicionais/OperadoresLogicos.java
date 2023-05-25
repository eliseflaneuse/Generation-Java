package lacosCondicionais;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int notaProat, notaTrab;
		
		System.out.println("Digite sua nota de Proatividade: ");
		notaProat = leia.nextInt();
		
		System.out.println("Digite sua nota de Trabalho em Equipe: ");
		notaTrab = leia.nextInt();
		
		System.out.println(notaProat + notaTrab);
		
		if(notaProat == 4 || notaTrab == 4) {
			System.out.println("Parabéns, você obteve pelo menos uma nota 4");
		} else {
			System.out.println("Infelizmente você não teve nenhuma nota 4");
		}
	}

}
