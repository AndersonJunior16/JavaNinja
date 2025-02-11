package NivelFacil.Condicoes;

import java.util.Scanner;

public class SwitchCases {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu inicial! \n");

        System.out.println("1 - chamander");
        System.out.println("2 - squirtle");
        System.out.println("1 - bulbassaur");

        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Você escolheu o melhor inicial!");
                break;
            case 2:
                System.out.println("Você escolheu o pior inicial");
                break;
            case 3:
                System.out.println("Você escolheu o inicial mediano");
                break;
            default:
                System.out.println("Você fez uma escolha invalida");
        }


        scanner.close();
    }
}
