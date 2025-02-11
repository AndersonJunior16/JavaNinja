package NivelFacil.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        int idade = 6;
        boolean hokage = false;
        short missoes = 14;

        if (missoes > 10 && idade > 15){
            System.out.println("Naruto está pronto para passar de nivel");
        } else {
            System.out.println("Naruto não está pronto para passar de nivel");
        }

    }
}
