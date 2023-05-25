package lacosCondicionais;

import java.util.Scanner;

public class LacoSimples2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Boolean persistence;
		int option;
		
		System.out.println("Digite 1 para verificar sua persistência  ou 2 para sair:");
		option = read.nextInt();
		
		switch(option) {
		case 1: 
			System.out.println("Se você estiver tendo persistência digite -true- se não digite -false-");
			persistence = read.nextBoolean();
			
			if(persistence == false) {
				System.out.println("Por falta de persistência você não acabou o curso.");
			} else if (persistence == true) {
				System.out.println("Parabéns");
			}
		
		}

	}

}
