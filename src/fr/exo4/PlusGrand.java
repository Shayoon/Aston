package fr.exo4;

import java.util.Scanner;

public class PlusGrand {

    public static void trouverLePlusGrand (){
        int nbr1 = demanderSaisie("Saisir le premier chiffre");
        int nbr2 = demanderSaisie("Saisir le second chiffre");
        int nbr3 = demanderSaisie("Saisir le troiseme chiffre");
        int plusGrand = nbr1;
        if (nbr2 > plusGrand)
            plusGrand = nbr2;
        if (nbr3 > plusGrand)
            plusGrand = nbr3;

        System.out.printf("[%d , %d , %d] --> %d", nbr1, nbr2, nbr3, plusGrand );
    }

    public static int demanderSaisie (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
