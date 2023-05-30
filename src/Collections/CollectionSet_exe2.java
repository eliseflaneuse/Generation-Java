package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet_exe2 {

	public static void main(String[] args) {
		
		Set<Integer> setNumeros = new HashSet<>();
		
		//Dúvida: essa é única forma de adicionar ao HashSet?
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		
		try (Scanner leia = new Scanner(System.in)) {
			int num = leia.nextInt();
			if (setNumeros.contains(num)) {
	            System.out.println("Número " + num + " Encontrado!");
	        } else {
	            System.out.println("O número " + num + " não foi encontrado!");
	        }
		}

	}

}
