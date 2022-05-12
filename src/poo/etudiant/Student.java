package poo.etudiant;

import java.util.Scanner;

public class Student {
    private String nom;
    private int note1, note2;

    public Student(String nom, int note1, int note2) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNote1() {
        return note1;
    }

    public void setNote1(int note1) {
        this.note1 = note1;
    }

    public int getNote2() {
        return note2;
    }

    public void setNote2(int note2) {
        this.note2 = note2;
    }

    public static Student creerUnEtudiant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de l'étudiant");
        String nom = scanner.nextLine();
        System.out.println("Entrez la première note");
        int note1 = scanner.nextInt();
        System.out.println("Entrez la seconde note");
        int note2 = scanner.nextInt();
        return new Student(nom,note1,note2);
    }

    public double calcAverage(){
        return (note1 + note2) / 2.0;
    }

    public void show(){
        System.out.println("nom de l'étudiant : " + getNom());
        System.out.println("Moyenne de l'étudiant : " + calcAverage());
    }

}
