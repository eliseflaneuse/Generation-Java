package aula3;

import java.util.Scanner;

public class LacoRepeticaoWhile_exe1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String iniciar = "s";
		int idade;
        int menor21 = 0;
        int maior50 = 0;
        
        
        System.out.println("Inicializar programa? Digite s para sim e n para não.");
        iniciar = leia.next();
        
        while(iniciar.equals("s")) {
        	System.out.println("Digite uma idade (digite uma idade negativa para finalizar):");
            idade = leia.nextInt();  
            if (idade < 0) {
                break;
            }
            
            if (idade < 21) {
                menor21++;
            } else if (idade > 50) {
                maior50++;
            }
        }
        
        System.out.println("Total de pessoas com idade menor que 21 anos: " + menor21);
        System.out.println("Total de pessoas com idade maior que 50 anos: " + maior50);
        
	}

}
