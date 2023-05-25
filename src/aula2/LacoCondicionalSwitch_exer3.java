package aula2;

import java.util.Scanner;

public class LacoCondicionalSwitch_exer3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float num1, num2, resultado;
		int codOper;
		
		System.out.println("Digite o Código da Operação que deseja realizar:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
	    System.out.println("Digite o código da operação (1 a 4): ");
	    codOper = leia.nextInt();
	    
	    System.out.println("Digite o primeiro número: ");
	    num1 = leia.nextFloat();
	      
	    System.out.println("Digite o segundo número: ");
	    num2 = leia.nextFloat();
	    
	    switch (codOper) {
        case 1:
            resultado = num1 + num2;
            System.out.println("Resultado da soma: " + num1 + " + " + num2 + " = " + resultado);
            break;
        case 2:
            resultado = num1 - num2;
            System.out.println("Resultado da subtração: " + num1 + " - " + num2 + " = " + resultado);
            break;
        case 3:
            resultado = num1 * num2;
            System.out.println("Resultado da multiplicação: " + num1 + " * " + num2 + " = " + resultado);
            break;
        case 4:
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado da divisão: " + num1 + " / " + num2 + " = " + resultado);
            } else {
                System.out.println("Divisão por zero não é permitida!");
            }
            break;
        default:
            System.out.println("Operação Inválida!");
	    }

	}

}
