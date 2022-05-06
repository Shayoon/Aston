package fr.exo1;

import java.util.Scanner;

public class Exo01 {
    public static void bienvenue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nom");
        String nom = scanner.next();
        System.out.println("Bienvenue ".concat(nom));
    }
}
