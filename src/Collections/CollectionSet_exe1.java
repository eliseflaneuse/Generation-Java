package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet_exe1 {

	public static void main(String[] args) {

		Set<Integer> setNumeros = new HashSet<>();

		try (Scanner leia = new Scanner(System.in)) {
			
			System.out.println("Digite 10 números inteiros não repetidos:");

			while (setNumeros.size() < 10) {
				int num = leia.nextInt();
				if (setNumeros.contains(num)) {
					System.out.println("Número repetido: " + num + ". Digite outro número.");
				} else {
					setNumeros.add(num);
				}
			}
		}

		Iterator<Integer> isetNumeros = setNumeros.iterator();

		System.out.println("\nNúmeros adicionados:");
		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
	}
}
