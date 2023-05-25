package aula2;

import java.util.Scanner;

public class LacoCondicionalSwitch_exe2 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 
		 String nomeColaborador;
		 String cargo;
		 int codigoCargo;
		 float salario;
		 float percentualReajuste;
		 
		 System.out.println("Digite o Nome do Colaborador: ");
	     nomeColaborador = leia.nextLine();

	     System.out.println("Código do Cargo do Colaborador (1 a 6): ");
	     codigoCargo = leia.nextInt();

	     System.out.println("Salário do Colaborador: ");
	     salario = leia.nextFloat();
	  
	     switch (codigoCargo) {
         case 1:
        	 cargo = "Gerente";
             percentualReajuste = 10;
             break;
         case 2:
        	 cargo = "Vendedor";
             percentualReajuste = 7;
             break;
         case 3:
        	 cargo = "Supervisor";
             percentualReajuste = 9;
             break;
         case 4:
        	 cargo = "Motorista";
             percentualReajuste = 6;
             break;
         case 5:
        	 cargo = "Estoquista";
             percentualReajuste = 5;
             break;
         case 6:
        	 cargo = "Técnico de TI";
             percentualReajuste = 8;
             break;
         default:
             System.out.println("Código de Cargo inválido!");
             return;
	     }
	     
	     float reajuste = (percentualReajuste / 100) * salario;
	     float novoSalario = salario + reajuste;
	     
	     System.out.println("Nome do Colaborador: " + nomeColaborador);
	     System.out.println("Cargo: " + cargo);
	     System.out.println("Novo Salário: R$ " + novoSalario);
	     
	}

}
