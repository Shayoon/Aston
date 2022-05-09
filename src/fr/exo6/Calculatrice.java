package fr.exo6;

import java.util.Scanner;

public class Calculatrice {
    public static void calculatrice() {
        int nbr1 = demanderSaisieInt("Entrez le premier nombre");
        String operateur = demanderSaisieOperateur("Entrez l'operateur (* . / . + . -)");
        int nbr2 = demanderSaisieInt("Entrez le second nombre");

        switch (operateur) {
            case "*" -> System.out.printf("%d * %d = %d", nbr1, nbr2, nbr1 * nbr2);
            case "/" -> System.out.printf("%d / %d = %f", nbr1, nbr2, (float)nbr1 / nbr2);
            case "+" -> System.out.printf("%d + %d = %d", nbr1, nbr2, nbr1 + nbr2);
            case "-" -> System.out.printf("%d - %d = %d", nbr1, nbr2, nbr1 - nbr2);
        }

    }

    public static int demanderSaisieInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public static String demanderSaisieOperateur(String message) {
        Scanner scanner = new Scanner(System.in);
        String Operateur;
        do {
            System.out.println(message);
            Operateur = scanner.nextLine();
        } while (!Operateur.equals("*") && !Operateur.equals("/") && !Operateur.equals("+") && !Operateur.equals("-"));
        return Operateur;
    }
}
