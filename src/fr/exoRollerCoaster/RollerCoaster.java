package fr.exoRollerCoaster;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RollerCoaster {

    public static int profitDeLaJournee() {
        int nbPlaces = 5;
        int nbTours = 3;
        int profit = 0;
        int nbPlacesRestantes;
        List<Integer> nbrPersonnes = new ArrayList<>();
        nbrPersonnes.add(2);
        nbrPersonnes.add(3);
        nbrPersonnes.add(2);
        nbrPersonnes.add(5);
        System.out.println("File de base" + nbrPersonnes);






        for (int i = 0; i < nbTours; i++) {
            System.out.printf("Tour %d ", i + 1);
            nbPlacesRestantes = nbPlaces - nbrPersonnes.get(0);
            profit += nbrPersonnes.get(0);
            System.out.print("groupe 1 rentre ");
            int nbrRotate = -1;
            int indiceRecherche = 1;
            boolean vaDemarrer = false;

            do {
                if (nbrPersonnes.get(indiceRecherche) <= nbPlacesRestantes) {
                    nbPlacesRestantes -= nbrPersonnes.get(indiceRecherche);
                    nbrRotate--;
                    profit += nbrPersonnes.get(indiceRecherche);
                    System.out.printf(",groupe %d rentre", indiceRecherche + 1);
                } else vaDemarrer = true;
                indiceRecherche++;
            } while (indiceRecherche < nbrPersonnes.size() && !vaDemarrer);
            Collections.rotate(nbrPersonnes, nbrRotate);
            System.out.print(". Etat de la file" + nbrPersonnes);
            System.out.println();

        }


        return profit;
    }

}
