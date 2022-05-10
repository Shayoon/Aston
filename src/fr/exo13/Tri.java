package fr.exo13;

public class Tri {
    public static int[] triPetitGrand(int[] tableau){
        int echange;
        for (int i = 0; i < tableau.length ; i++) {
            for (int j = 0; j < tableau.length - 1; j++) {
                if (tableau[j]>tableau[j+1]){
                    echange = tableau[j];
                    tableau[j]=tableau[j+1];
                    tableau[j+1]=echange;
                }

            }
            afficherTableau(tableau);

        }

        return tableau;
    }

    public static void afficherTableau(int[] tableau){
        System.out.print("[");
        for (int i = 0; i < tableau.length ; i++) {
            System.out.print(tableau[i]);
            if (i!=tableau.length-1)
                System.out.print(",");
        }
        System.out.println("]");
    }

}
