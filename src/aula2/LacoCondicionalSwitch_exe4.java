package aula2;

import java.util.Scanner;

public class LacoCondicionalSwitch_exe4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float saldo = 1000.00f;
		float saque, deposito;
		int operacao;
		
		System.out.println("Escolha o tipo de operação a ser realizada: ");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
	    System.out.println("Digite o código da operação (1 a 3): ");
	    operacao = leia.nextInt();
	    
	    switch (operacao) {
        case 1:
            System.out.println("Operação - Saldo\r\n"
            		+ "\r\n"
            		+ "Saldo: R$" + saldo);
            break;
        case 2:
        	System.out.println("Digite o valor do saque: ");
    		saque = leia.nextFloat();
        	if(saque <= saldo) {
    		saldo = saldo - saque;
            System.out.println("Operação - Saque\r\n"
            		+ "\r\n"
            		+ "Saldo: R$" + saldo);
        	} else if(saque > saldo) {
        		System.out.println("Saldo Insuficiente!");
        	} else {
        		System.out.println("Operação Inválida!");
        	}
            break;
        case 3:
        	System.out.println("Digite o valor do depósito: ");
    		deposito = leia.nextFloat();
        	saldo = saldo + deposito;
        	System.out.println("Operação - Depósito\r\n"
            		+ "\r\n"
            		+ "Saldo: R$" + saldo);
            break;
        default:
            System.out.println("Operação Inválida!");
	    }
	    
	    
	}

}
