package NivelFacil.Condicoes;

import java.util.Scanner;

public class ternarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        String resposta = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";

        System.out.println(resposta);

        scanner.close();
    }
}
