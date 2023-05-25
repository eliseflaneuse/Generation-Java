package aula1;

import java.util.Scanner;

public class SalarioAbono {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		float novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.println("\nNovo Salário: " + novosalario);
		
	}

}
