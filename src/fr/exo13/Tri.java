package fr.exo13;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tri {
    public static int[] triPetitGrandTab(int[] tableau) {
        int echange;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau.length - 1; j++) {
                if (tableau[j] > tableau[j + 1]) {
                    echange = tableau[j];
                    tableau[j] = tableau[j + 1];
                    tableau[j + 1] = echange;
                }

            }
            afficherTableau(tableau);

        }

        return tableau;
    }

    public static void afficherTableau(int[] tableau) {
        System.out.print("[");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i != tableau.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }



    public static void triPetitGrandList(List<Integer> listeChiffre){
        Collections.sort(listeChiffre, Collections.reverseOrder());
        System.out.println(listeChiffre);
    }

}
