package fr.exo12;

public class Temperature {

    public static void plusProche(int[]temperatures){
        int plusProche = temperatures[0];
        for (int temperature : temperatures) {
            if (temperature < 0) {
                if (Math.abs(temperature) <= Math.abs(plusProche)) {
                    plusProche = temperature;
                }
            } else if (temperature < Math.abs(plusProche)) {
                plusProche = temperature;
            }

        }
        System.out.println("Le plus proche est : " + plusProche);
    }
}
