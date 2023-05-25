package aula2;

import java.util.Scanner;

public class LacoCondicionalIf_exe1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite 3 números a seguir");
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		if(a+b>c) {
			System.out.println("A Soma de A + B é Maior do que C");
		}else if(a+b<c){
			System.out.println("A Soma de A + B é Menor do que C");
		}else if(a+b==c) {
			System.out.println("A Soma de A + B é Igual a C");
		}else {
			System.out.println("Algum erro ocorreu, tente novamente!");
		}

	}

}
