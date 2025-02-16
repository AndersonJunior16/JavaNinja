package NivelIntermediario.DesafioCinco;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Desposito concluido");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo atual de sua conta corrente é de: R$" + saldo);
    }
}
