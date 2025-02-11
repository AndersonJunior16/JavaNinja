package NivelIntermediario.DesafioQuatro;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Olá meu nome é " + nome + ", tenho " + idade + " anos e sou um ninja avançado");
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
        System.out.println("Minha especialiadade é: " + especialidade);
    }
}
