package fr.exo9;

import java.util.Scanner;

public class Pyramide {
    public static void pyramide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un chiffre");
        int nbr = scanner.nextInt();
        for (int i = 0; i < nbr + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = nbr - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
