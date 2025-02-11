package NivelIntermediario.DesafioTres;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostraInfo(){
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel da Missão: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusMissao);
    }

}
