package aula2;

import java.text.Normalizer;
import java.util.Scanner;

public class LacoCondicionalIf_exe4 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        String vertebrae;
        String type;
        String diet;

        System.out.println("\nVamos ver que animal você acaba escolhendo? \nSiga as perguntas e escolha uma entre as opções apresentadas a seguir: ");
        System.out.println("Vertebrado ou Invertebrado?");
        vertebrae = leia.next();

        vertebrae = removerAcentos(vertebrae.toLowerCase()); // Remover acentos e converter para minúsculas

        if (vertebrae.equalsIgnoreCase("vertebrado")) {
            System.out.println("Escolha uma entre as opções apresentadas: ");
            System.out.println("Ave ou Mamífero?");
            type = leia.next();

            type = removerAcentos(type.toLowerCase()); // Remover acentos e converter para minúsculas

            if (type.equalsIgnoreCase("ave")) {
                System.out.println("Escolha uma entre as dietas apresentadas: ");
                System.out.println("Carnívora ou Onívora?");
                diet = leia.next();

                diet = removerAcentos(diet.toLowerCase()); // Remover acentos e converter para minúsculas

                if (diet.equalsIgnoreCase("carnivora")) {
                    System.out.println("Você escolheu a Águia!");
                } else if (diet.equalsIgnoreCase("onivora")) {
                    System.out.println("Você escolheu a Pomba!");
                }
            } else if (type.equalsIgnoreCase("mamifero")) {
                System.out.println("Escolha uma entre as dietas apresentadas: ");
                System.out.println("Onívora ou Herbívora?");
                diet = leia.next();

                diet = removerAcentos(diet.toLowerCase()); // Remover acentos e converter para minúsculas

                if (diet.equalsIgnoreCase("onivora")) {
                    System.out.println("Você escolheu o Ser Humano!");
                } else if (diet.equalsIgnoreCase("herbivora")) {
                    System.out.println("Você escolheu a Vaca!");
                }
            }

        } else if (vertebrae.equalsIgnoreCase("invertebrado")) {
            System.out.println("Escolha uma entre as opções apresentadas: ");
            System.out.println("Inseto ou Anelideo?");
            type = leia.next();

            type = removerAcentos(type.toLowerCase()); // Remover acentos e converter para minúsculas

            if (type.equalsIgnoreCase("inseto")) {
                System.out.println("Escolha uma entre as dietas apresentadas: ");
                System.out.println("Hematofaga ou Herbivora?");
                diet = leia.next();

                diet = removerAcentos(diet.toLowerCase()); // Remover acentos e converter para minúsculas

                if (diet.equalsIgnoreCase("hematofaga")) {
                    System.out.println("Você escolheu a Pulga!");
                } else if (diet.equalsIgnoreCase("herbivora")) {
                    System.out.println("Você escolheu a Lagarta!");
                }
            } else if (type.equalsIgnoreCase("anelideo")) {
                System.out.println("Escolha uma entre as dietas apresentadas: ");
                System.out.println("Hematofaga ou Onivora?");
                diet = leia.next();

                diet = removerAcentos(diet.toLowerCase()); // Remover acentos e converter para minúsculas

                if (diet.equalsIgnoreCase("hematofaga")) {
                    System.out.println("Você escolheu a Sanguessuga!");
                } else if (diet.equalsIgnoreCase("onivora")) {
                    System.out.println("Você escolheu a Minhoca!");
                }
            } else {
                System.out.println("Verifique a correta grafia das suas respostas e tente novamente!");
            }
        }
    }

    // Função para remover acentos de uma string
    public static String removerAcentos(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}

