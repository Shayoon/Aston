package fr.exo2;

import java.util.Scanner;

public class Addition {
    public static void ajouter (){
        int nbr1 = demanderSaisie("Saisir un premier chiffre");
        int nbr2 = demanderSaisie("Saisir un second chiffre");
        System.out.printf("%d + %d = %d",nbr1,nbr2, nbr1+nbr2);
    }

    public static int demanderSaisie (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}


















