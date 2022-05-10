package fr.exo11;

import java.util.Scanner;

public class RendreMonnaie {

    public static void rendreLaMonnaie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rentrer un montant");
        double argent = scanner.nextDouble();
        int nbRendu = 0;
        if (argent >= 500) {
            nbRendu = (int) argent / 500;
            System.out.println("Billet de 500 : " + nbRendu);
            argent = argent - (nbRendu * 500);
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 200) {
            nbRendu = (int) argent / 200;
            System.out.println("Billet de 200 : " + nbRendu);
            argent = argent - (nbRendu * 200);
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 100) {
            nbRendu = (int) argent / 100;
            System.out.println("Billet de 100 : " + nbRendu);
            argent = argent - (nbRendu * 100);
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 50) {
            nbRendu = (int) argent / 50;
            System.out.println("Billet de 50 : " + nbRendu);
            argent = argent - (nbRendu * 50);
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 20) {
            nbRendu = (int) argent / 20;
            System.out.println("Billet de 20 : " + nbRendu);
            argent = argent - (nbRendu * 20);
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 10) {
            nbRendu = (int) argent / 10;
            System.out.println("Billet de 10 : " + nbRendu);
            argent = argent - (nbRendu * 10);
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 5) {
            nbRendu = (int) argent / 5;
            System.out.println("Billet de 5 : " + nbRendu);
            argent = argent - (nbRendu * 5);
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 2) {
            nbRendu = (int) argent / 2;
            System.out.println("Piece de 2 : " + nbRendu);
            argent = argent - (nbRendu * 2);
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 1) {
            nbRendu = (int) argent / 1;
            System.out.println("Piece de 1 : " + nbRendu);
            argent = argent - (nbRendu * 1);
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 0.50) {
            System.out.println("Piece de 0.5 : 1");
            argent = argent - 0.5;
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 0.20) {
            if (argent >= 0.40) {
                System.out.println("Piece de 0.20 : 2 ");
                argent -= 0.40;
            } else {
                System.out.println("Piece de 0.20 : 1 ");
                argent -= 0.20;
            }
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 0.10) {
            System.out.println("Piece de 0.10 : 1 ");
            argent -= 0.10;
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 0.05) {
            System.out.println("Piece de 0.05 : 1 ");
            argent -= 0.05;
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 0.02) {
            if (argent >= 0.04) {
                System.out.println("Piece de 0.02 : 2 ");
                argent -= 0.04;
            } else {
                System.out.println("Piece de 0.02 : 1 ");
                argent -= 0.02;
            }
            argent = Math.round(argent * 100.0) / 100.0;
        }
        if (argent >= 0.01) {
            System.out.println("Piece de 0.01 : 1 ");
            argent -= 0.01;
            argent = Math.round(argent * 100.0) / 100.0;
        }
    }
}
