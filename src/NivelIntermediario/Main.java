package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja();

        naruto.nome = "Naruto";
        naruto.idade = 17;
        naruto.Aldeia = "Aldeia da folha";

        System.out.println(naruto.Ola() + " meu nome é " + naruto.nome + ", minha idade é " + naruto.idade + " anos e sou da " + naruto.Aldeia);

    }
}
