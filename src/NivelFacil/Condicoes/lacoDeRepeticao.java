package NivelFacil.Condicoes;

import java.util.Scanner;

public class lacoDeRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos clones o Naruto fará?");
        int maximoClones = scanner.nextInt();

        for (int i = 0; i < maximoClones; i++) {
            System.out.println("O Naruto fez " + (i + 1) + " clones");
        }

        System.out.println("O Naruto acabou");


        scanner.close();
    }
}
