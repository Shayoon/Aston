package fr.exo12;

public class Temperature {

    public static void plusProche(int[]temperatures){
        int plusProche = temperatures[0];
        int distancePlusProche = 0;
        int distance;

        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];
            if (i == 0){
                if(temperature > 0){
                    plusProche = temperature;
                    distancePlusProche = temperature;
                }
                else {
                    distancePlusProche = -temperature;
                    plusProche = temperature;
                }
            }
            if (temperature < 0){
                distance = -temperature;
                if (distance < distancePlusProche){
                    plusProche = temperature;
                    distancePlusProche = distance;
                }
            }
            else {
                if (temperature < distancePlusProche){
                    plusProche = temperature;
                    distancePlusProche = temperature;
                }
            }
        }
        System.out.println("Le plus proche est : " + plusProche);
    }
}
