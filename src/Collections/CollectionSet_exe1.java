package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet_exe1 {

	public static void main(String[] args) {

		Set<Integer> setNumeros = new HashSet<>();

		/* Aqui para evitar o erro que aparecia em Scanner eu tentei a construção try (Scanner leia = new Scanner(System.in)).
		 * Essa construção é chamada de "try-with-resources" e é , de acordo com a documentação, 
		 * uma forma mais conveniente de lidar com recursos que precisam ser fechados após o uso, como o caso do objeto Scanner. 
		 * O bloco try permite que você execute um código que pode lançar exceções,
		 *  e o recurso dentro dos parênteses, neste caso o Scanner, será fechado automaticamente ao final do bloco try,
		 *   independentemente se ocorrer uma exceção ou não.
		 *   Tentei também o leia.close(), mas continuava alegando vazamento de recursos.
		*/
		
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
		
		/* A interface java.util.Iterator é usada no Java para percorrer coleções de elementos de forma ordenada 
		 * e sem expor sua estrutura interna. Ela fornece métodos como:
		 *  hasNext() para verificar se há mais elementos, 
		 *  next() para obter o próximo elemento e 
		 *  remove() opcionalmente para remover o elemento atual da coleção. 
		 *  É obtida a partir de coleções que a suportam, como ArrayList ou HashSet, 
		 *  e é usada em um laço while para percorrer os elementos um a um. 
		 */

		Iterator<Integer> isetNumeros = setNumeros.iterator();

		System.out.println("\nNúmeros adicionados:");
		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
	}
}


