package NivelIntermediario.DesafioCinco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaCorrente contaCorrente = new ContaCorrente(0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(0);

        int opcao = -1;

        while (opcao != 0){

            System.out.println("--------------Conta--------------");
            System.out.println("1 - Deposito em Conta corrente.");
            System.out.println("2 - Ver saldo em Conta corrente.");
            System.out.println("3 - Deposito em Conta poupança.");
            System.out.println("4 - Ver saldo em Conta poupança.");
            System.out.println("5 - Ver saldo total.");
            System.out.println("0 - Sair.");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite o valor para deposito: ");
                    double valorCorrente = scanner.nextDouble();
                    scanner.nextLine();
                    contaCorrente.depositar(valorCorrente);
                    break;
                case 2:
                    contaCorrente.consultarSaldo();
                    break;
                case 3:
                    System.out.print("Digite o valor para deposito: ");
                    double valorPoupanca = scanner.nextDouble();
                    scanner.nextLine();
                    contaPoupanca.depositar(valorPoupanca);
                    break;
                case 4:
                    contaPoupanca.consultarSaldo();
                    break;
                case 5:
                    System.out.println("Valor total das duas contas: " + (contaCorrente.saldo + contaPoupanca.saldo));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Você digitou uma opção incorreta!");
            }
        }
        scanner.close();
    }
}
