package NivelFacil.Desafios;

public class DesafioUm {

    public static void main(String[] args) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        //Ninja 1
        System.out.print("\n");
        String ninja1 = "Naruto Uzumaki";
        int idade1 = 13;
        String missao1 = "Missão A";
        String statusMissao1 = "Em andamento";
        char nivel1 = 'D';

        System.out.println(ninja1);
        System.out.println(idade1);
        System.out.println(missao1);
        System.out.println(statusMissao1);
        System.out.println(nivel1);

        if (idade1 < 15 ){
            if (nivel1 == 'C' || nivel1 == 'D'){
                System.out.println("Missão concluida");
            }else{
                System.out.println("O Missão é de um nivel muito alto para o ninja");
            }
        } else{
            System.out.println("Missão concluida");
        }


        //Ninja 2
        System.out.println("\n");
        String ninja2 = "Sasuke Uchiha";
        int idade2 = 16;
        String missao2 = "Missão C";
        String statusMissao2 = "Em andamento";
        char nivel2 = 'C';

        System.out.println(ninja2);
        System.out.println(idade2);
        System.out.println(missao2);
        System.out.println(statusMissao2);
        System.out.println(nivel2);

        if (idade2 < 15 ){
            if (nivel2 == 'C' || nivel2 == 'D'){
                System.out.println("Missão concluida");
            }else{
                System.out.println("O Missão é de um nivel muito alto para o ninja");
            }
        } else{
            System.out.println("Missão concluida");
        }


        //Ninja 3
        System.out.println("\n");
        String ninja3 = "Sakura Haruno";
        int idade3 = 13;
        String missao3 = "Missão B";
        String statusMissao3 = "Em andamento";
        char nivel3 = 'B';

        System.out.println(ninja3);
        System.out.println(idade3);
        System.out.println(missao3);
        System.out.println(statusMissao3);
        System.out.println(nivel3);

        if (idade3 < 15 ){
            if (nivel3 == 'C' || nivel3 == 'D'){
                System.out.println("Missão concluida");
            }else{
                System.out.println("O Missão é de um nivel muito alto para o ninja");
            }
        } else{
            System.out.println("Missão concluida");
        }
    }
}
