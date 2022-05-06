package exo5;

import java.util.Scanner;

public class plusPetit {

    public static void trouverLePlusPetit (){
        int nbr1 = demanderSaisie("Saisir le premier chiffre");
        int nbr2 = demanderSaisie("Saisir le second chiffre");
        int nbr3 = demanderSaisie("Saisir le troiseme chiffre");
        int plusPetit = nbr1;
        if (nbr2 < plusPetit)
            plusPetit = nbr2;
        if (nbr3 < plusPetit)
            plusPetit = nbr3;

        System.out.printf("[%d , %d , %d] --> %d", nbr1, nbr2, nbr3, plusPetit );
    }

    public static int demanderSaisie (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

}
