package fr.exo8;

import java.util.Scanner;

public class Escalier {
    public static void escalier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un chiffre");
        int nbr = scanner.nextInt();
        for (int i = 0; i < nbr + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void escalierBoucleSimple() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un chiffre");
        int nbr = scanner.nextInt();
        String resultat = "";
        for (int i = 0; i < nbr + 1; i++) {
            resultat += "*";
            System.out.println(resultat);
        }
    }

}

