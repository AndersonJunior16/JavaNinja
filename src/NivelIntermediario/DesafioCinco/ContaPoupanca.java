package NivelIntermediario.DesafioCinco;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += (valor - (valor * 0.01));
        System.out.println("Desposito concluido com dedução de 1%");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo atual de sua conta poupança é de: R$" + saldo);
    }

}
