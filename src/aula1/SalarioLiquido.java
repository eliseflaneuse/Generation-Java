package aula1;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		float salariobruto, adicionalnoturno, horasextras, descontos, salarioliquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário Bruto: ");
		salariobruto = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		adicionalnoturno = leia.nextFloat();
		
		System.out.println("Digite as Horas Extras: ");
		horasextras = leia.nextFloat();
		
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		salarioliquido = (salariobruto + adicionalnoturno + (horasextras * 5))- descontos;
		
		System.out.println("\nSalário líquido: " + salarioliquido);
	}

}
