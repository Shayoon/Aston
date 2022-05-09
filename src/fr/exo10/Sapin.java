package fr.exo10;

import java.util.Scanner;

public class Sapin {
    public static void sapin() {
        int nbrLignes;
        int nbrEspace;
        Scanner scanner = new Scanner(System.in);
        int j;
        System.out.println("nombre de lignes : ");
        nbrLignes = scanner.nextInt();

        for (int i = 0; i < nbrLignes; i++) {

            nbrEspace = nbrLignes - i;

            for (j = 0; j < nbrEspace; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
