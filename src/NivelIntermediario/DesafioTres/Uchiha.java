package NivelIntermediario.DesafioTres;

public class Uchiha extends Ninja{
    String habilidadeEspecial = "Sharingan";

    public String MostrarHabilidade(){
        return "Minha habilidade especial é o " + habilidadeEspecial;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println(MostrarHabilidade());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}

