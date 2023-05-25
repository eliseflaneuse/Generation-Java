package aula2;

import java.util.Scanner;

public class LacoCondicionalSwitch_exe1 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("Código do Produto");
	     System.out.println("1 - Cachorro Quente - R$ 10.00");
	     System.out.println("2 - X-Salada - R$ 15.00");
	     System.out.println("3 - X-Bacon - R$ 18.00");
	     System.out.println("4 - Bauru - R$ 12.00");
	     System.out.println("5 - Refrigerante - R$ 8.00");
	     System.out.println("6 - Suco de laranja - R$ 13.00");

	     System.out.println("Digite o código do item (1 a 6):");
	     int codigo = leia.nextInt();

	     System.out.println("Digite a quantidade comprada:");
	     int quantidade = leia.nextInt();

	     double preco;
	     String nomeProduto;
	     
	     switch (codigo) {
         case 1:
             nomeProduto = "Cachorro Quente";
             preco = 10.00;
             break;
         case 2:
             nomeProduto = "X-Salada";
             preco = 15.00;
             break;
         case 3:
             nomeProduto = "X-Bacon";
             preco = 18.00;
             break;
         case 4:
             nomeProduto = "Bauru";
             preco = 12.00;
             break;
         case 5:
             nomeProduto = "Refrigerante";
             preco = 8.00;
             break;
         case 6:
             nomeProduto = "Suco de laranja";
             preco = 13.00;
             break;
         default:
             System.out.println("Código inválido!");
             return;
     }

	     double valorTotal = quantidade * preco;

	     System.out.println("Valor total: R$ " + valorTotal);
	     System.out.println("Produto: " + nomeProduto);
	     System.out.println("Obrigada pela preferência. Volte Sempre!");
	}

}
