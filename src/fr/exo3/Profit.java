package fr.exo3;

import java.util.Scanner;

public class Profit {
    public static void connaitreProfit(){
        int prixFabrication = demanderPrix("Quel est le prix de fabrication ?");
        int prixVente = demanderPrix("Quel est le prix de vente");
        int benefice =  prixVente - prixFabrication ;
        if (benefice < 0){
            System.out.println("Perte de " + -benefice + "€");
        }
        else {
            System.out.println("Profit de " + benefice + "€");
        }
    }

    public static int demanderPrix(String message){
        Scanner scanner = new Scanner(System.in);
        int prix;
        do {
            System.out.println(message);
            prix = scanner.nextInt();
        } while (prix <= 0);
        return prix;
    }


}
