package aula3;

import java.util.Scanner;

public class LacoRepeticaoWhile_exe2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int idade, sexo, categoria;
        int backend = 0; // frontend = 0, mobile= 0, fullstack = 0; 
        int frontendMulheres = 0, mobileHomensAcima40 = 0, fullstackMulheresAbaixo30 = 0;
        String iniciar = "s";

        while (iniciar.equalsIgnoreCase("s")) {
            System.out.println("Digite a idade du colaboradore:");
            idade = leia.nextInt();

            System.out.println("Digite o sexo du colaboradore:");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            System.out.println("3 - Outros");
            sexo = leia.nextInt();

            System.out.println("Digite a categoria du colaboradore:");
            System.out.println("1 - Backend");
            System.out.println("2 - Frontend");
            System.out.println("3 - Mobile");
            System.out.println("4 - FullStack");
            categoria = leia.nextInt();

            switch (categoria) {
                case 1:
                    backend++;
                    break;
                case 2:
                	frontend++;
                    if (sexo == 2) {
                        frontendMulheres++;
                    }
                    break;
                case 3:
                	mobile++;
                    if (sexo == 1 && idade > 40) {
                        mobileHomensAcima40++;
                    }
                    break;
                case 4:
                	fullstack++;
                    if (sexo == 2 && idade < 30) {
                        fullstackMulheresAbaixo30++;
                    }
                    break;
            }

            System.out.println("Deseja continuar a leitura dos dados de um novo colaborador? (S/N)");
            iniciar = leia.next();
        }
 
        System.out.println("Número de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("Número de mulheres desenvolvedoras Frontend: " + frontendMulheres);
        System.out.println("Número de homens desenvolvedores Mobile maiores de 40 anos: " + mobileHomensAcima40);
        System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstackMulheresAbaixo30);
	}

}
