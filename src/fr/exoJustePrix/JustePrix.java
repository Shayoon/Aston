package fr.exoJustePrix;

import java.util.Random;
import java.util.Scanner;

public class JustePrix {

    public static void jouer(){
        int prixMax = demanderSaisie("Choisir un prix max");
        int nbVie = demanderSaisie("Choisir un nombre de vie(s)");
        int alea = genererAleatoire(prixMax);
        boolean aTrouve = false;
        deroulerLaPartie(prixMax, nbVie, alea, aTrouve);
    }

    private static void deroulerLaPartie(int prixMax, int nbVie, int alea, boolean aTrouve) {
        int propositionUtilisateur;
        do {
            System.out.printf("Proposition restantes : %d\n", nbVie);
            if (nbVie == 0){
                System.out.printf("C'est rate, vous n'avez plus de vie.\nLe juste prix etait : %d\n", alea);
            } else {
                propositionUtilisateur = demanderPropositionUtilisateur(prixMax);
                aTrouve = verifierProposition(alea, propositionUtilisateur);
            }
        } while (!aTrouve && nbVie-- > 0);
    }

    private static boolean verifierProposition(int alea, int propositionUtilisateur) {
        boolean aTrouve = alea == propositionUtilisateur;
        if (aTrouve){
            System.out.println("Vous avez trouvez bravo");
        } else if (propositionUtilisateur > alea) {
            System.out.println("C'est moins");
        } else {
            System.out.println("C'est plus");
        }
        return aTrouve;
    }

    private static int genererAleatoire(int prixMax) {
        Random random = new Random();
        return random.nextInt(prixMax);
    }

    public static int demanderSaisie(String message){
        Scanner scanner = new Scanner(System.in);
        int chiffre;
        do {
            System.out.println(message);
            chiffre = scanner.nextInt();
        } while (chiffre < 1);
        return chiffre;
    }

    public static int demanderPropositionUtilisateur(int borneMax){
        int chiffre;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Entrez votre proposition (entre 0 et %d)\n", borneMax);
            chiffre = scanner.nextInt();
        } while (chiffre < 0 || chiffre >borneMax);
        return chiffre;
    }

}

