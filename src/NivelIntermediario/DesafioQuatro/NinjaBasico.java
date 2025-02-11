package NivelIntermediario.DesafioQuatro;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Olá meu nome é " + nome + ", tenho " + idade + " anos e sou um ninja iniciante");
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " ativando minha habilidade " + habilidade);
        System.out.println();
    }
}
