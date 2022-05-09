package fr.exo6;

import java.util.Scanner;

public class Calculatrice {
    public static void calculatrice() {
        float nbr1 = demanderSaisieFloat("Entrez le premier nombre");
        String operateur = demanderSaisieOperateur("Entrez l'operateur (* . / . + . -)");
        float nbr2 = demanderSaisieFloat("Entrez le second nombre");
        if (operateur.equals("/") && nbr2 == 0)
            System.out.println("Impossible de diviser par 0");
        else 
        switch (operateur) {
            case "*" -> System.out.printf("%f * %f = %f", nbr1, nbr2, nbr1 * nbr2);
            case "/" -> System.out.printf("%f / %f = %f", nbr1, nbr2, nbr1 / nbr2);
            case "+" -> System.out.printf("%f + %f = %d", nbr1, nbr2, nbr1 + nbr2);
            case "-" -> System.out.printf("%f - %f = %d", nbr1, nbr2, nbr1 - nbr2);
        }

    }

    public static Float demanderSaisieFloat(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextFloat();
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
