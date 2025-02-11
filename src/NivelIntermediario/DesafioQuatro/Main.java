package NivelIntermediario.DesafioQuatro;

public class Main {
    public static void main(String[] args) {

        NinjaBasico ninjaBasico = new NinjaBasico("Konohamaru", 15, "Jutsu de transformação");
        ninjaBasico.mostrarInfo();
        ninjaBasico.executarHabilidade();

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Naruto", 20, "Clone das sombras", "Kyuubi");
        ninjaAvancado.mostrarInfo();
        ninjaAvancado.executarHabilidade();
    }
}
