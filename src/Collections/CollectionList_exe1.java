package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionList_exe1 {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
        System.out.println("Digite 5 cores:");

        for (int i = 0; i < 5; i++) {
            String cor = leia.nextLine();
            cores.add(cor);
        }
		
        // Imprimir as cores
        System.out.println("\nLista de todas as cores:");
        for (String cor : cores) {
        	System.out.println(cor);
        }
        
        // Ordenar e imprimir as cores
        Collections.sort(cores);
        System.out.println("\nLista das cores ordenadas:");
        for (String cor : cores) {
        	System.out.println(cor);
        }
	}

}
