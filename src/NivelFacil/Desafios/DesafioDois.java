package NivelFacil.Desafios;

import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maximoDeNinjas = 5;
        String[] nomeNinja = new String[maximoDeNinjas];
        int quantidadeDeNinjas = 0;

        int resposta = 0;
        while (resposta != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            resposta = scanner.nextInt();
            scanner.nextLine();

            switch (resposta) {
                case 1:
                    if (quantidadeDeNinjas < maximoDeNinjas) {
                        System.out.print("Digite o nome do ninja: ");
                        nomeNinja[quantidadeDeNinjas] = scanner.nextLine();
                        quantidadeDeNinjas++;
                    }
                    else {
                        System.out.println("Quantidade maxima de ninjas cadastrados");
                    }
                    break;
                case 2:
                    System.out.println("=-=-=-=Nome dos nijas=-=-=-=");
                    for (int i = 0; i < quantidadeDeNinjas; i++) {
                        System.out.println(nomeNinja[i]);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Você digitou uma opção errada!");
                    break;
            }

        }


        scanner.close();
    }
}
