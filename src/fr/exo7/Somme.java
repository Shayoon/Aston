package fr.exo7;

public class Somme {
    public static void somme(int nbr) {
        int resultat = 0;
        for (int i = 1; i <= nbr ; i++) {
            resultat += i;
            if (i == 1)
                System.out.print(i);
            else
                System.out.print(" + " + i);
        }
        System.out.print(" = " + resultat);
    }
}
