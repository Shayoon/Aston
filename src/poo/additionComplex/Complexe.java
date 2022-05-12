package poo.additionComplex;

import java.util.Scanner;

public class Complexe {
    private int reel;
    private int imaginaire;

    public Complexe(int reel, int imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public int getReel() {
        return reel;
    }

    public void setReel(int reel) {
        this.reel = reel;
    }

    public int getImaginaire() {
        return imaginaire;
    }

    public void setImaginaire(int imaginaire) {
        this.imaginaire = imaginaire;
    }

    public static Complexe creerComplexe(){
        Complexe complexe;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la partie reelle");
        int reel = scanner.nextInt();
        System.out.println("Entrez la partie imaginaire");
        int imaginaire = scanner.nextInt();
        return new Complexe(reel,imaginaire);
    }

    public static void sommeComplexe(Complexe c1, Complexe c2){
        System.out.printf("La somme est %d + %di",c1.getReel() + c2.getReel(), c1.getImaginaire() + c2.getImaginaire());
    }


}
