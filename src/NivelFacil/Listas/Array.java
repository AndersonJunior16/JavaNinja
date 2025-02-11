package NivelFacil.Listas;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomeNinja = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º ninja: ");
            nomeNinja[i] = scanner.nextLine();

        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Ninja " + (i +1) + "º: " + nomeNinja[i]);
        }
        scanner.close();
    }
}
