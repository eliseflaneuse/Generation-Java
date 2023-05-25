package lacosCondicionais;

import java.util.Scanner;

public class LacosSimples {

	public static void main(String[] args) {

		int num;
		Scanner ler = new Scanner(System.in);

	 	System.out.println("Digite um número: ");
		num = ler.nextInt();

		if (num >= 4) {
			System.out.println("Conta paga no débito!");
		} else {
			System.out.println("Conta paga no crédito!");
		}
	}

}
