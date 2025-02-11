package NivelFacil.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();

        if (idade < 18){
            System.out.println(nome + " é menor de idade!");
        } else {
            System.out.println(nome + " é maior de idade!");
        }


        scanner.close();
    }
}
