package NivelIntermediario.DesafioTres;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int maximoNinjas = 5;
        int ninjascadastrados = 0;
        Uchiha[] uchiha = new Uchiha[maximoNinjas];

        int opc = 0;

        while (opc != 4) {
            System.out.println("\tMenu");
            System.out.println("Escolha abaixo qual opção desejada:\n");
            System.out.println("1 - Adicionar ninja");
            System.out.println("2 - Mostrar todos os ninjas");
            System.out.println("3 - Mudar habilidade");
            System.out.println("4 - Sair");
            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1:
                    if (ninjascadastrados < maximoNinjas) {
                        uchiha[ninjascadastrados] = new Uchiha();

                        System.out.print("Digite o nome do Uchiha: ");
                        uchiha[ninjascadastrados].nome = scanner.nextLine();

                        System.out.print("Digite a idade do Uchiha: ");
                        uchiha[ninjascadastrados].idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o nome da missão: ");
                        uchiha[ninjascadastrados].missao = scanner.nextLine();

                        System.out.print("Digite a dificuldade da missão: ");
                        uchiha[ninjascadastrados].nivelDificuldade = scanner.nextLine();

                        System.out.print("Digite o status da missão: ");
                        uchiha[ninjascadastrados].statusMissao = scanner.nextLine();
                        ninjascadastrados++;
                    } else {
                        System.out.println("Maximo de ninjas cadastrados");
                    }
                    break;
                case  2:
                    for (int i = 0; i < ninjascadastrados; i++) {
                        uchiha[i].mostraInfo();
                    }
                    break;
                case 3:
                    int opchabilidade = -1;
                    System.out.println("Qual ninja deseja mudar a habilidade?");
                    for (int i = 0; i < ninjascadastrados; i++) {
                        System.out.println((i+ 1) +"º " + uchiha[i].nome + ": habilidade -> " + uchiha[i].habilidadeEspecial);
                    }
                    opchabilidade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite a nova habilidade de " + uchiha[opchabilidade  -1 ].nome + ": ");
                    uchiha[opchabilidade -1 ].habilidadeEspecial = scanner.nextLine();
                    System.out.println("Alterado com sucesso!");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Você digitou uma opção invalida");
            }
        }
        scanner.close();
    }
}
