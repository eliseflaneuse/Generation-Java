package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList_exe2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int num, posicao;

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
        num = leia.nextInt();
        
        posicao = numeros.indexOf(num);
        if (posicao != -1) {
            System.out.println("O número " + num + " está localizado na posição: " + posicao + ".");
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
        }
        
        
	}

}
