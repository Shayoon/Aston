package fr.exo11bis;

import java.util.Scanner;

public class RendreMonnaie {
//
    public static void rendreLaMonnaie(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rentrer un montant");
        double argent = scanner.nextDouble();
        double[] monnaie = new double[] {500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01};
        for (int i = 0; i < monnaie.length ; i++) {
            int nbrBillet = (int)(argent/monnaie[i]);
            if (nbrBillet != 0) {
                if(monnaie[i]>= 5)
                    System.out.println("Billet de " + (int)monnaie[i] + " : " + nbrBillet);
                else
                    System.out.println("Piece de " + monnaie[i] + " : " + nbrBillet);
                argent = argent % monnaie[i];
                argent = Math.round(argent * 100.0) / 100.0;
            }
        }
    }
}
