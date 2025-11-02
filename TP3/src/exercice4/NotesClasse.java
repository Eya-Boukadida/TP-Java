package exercice4;

import java.util.Scanner;

public class NotesClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien d'élèves y a-t-il dans la classe ? ");
        int n = sc.nextInt();

        double[] notes = new double[n]; // tableau pour stocker les notes

        for (int i = 0; i < n; i++) {
            System.out.print("Note de l'élève " + (i + 1) + " sur 20 : ");
            notes[i] = sc.nextDouble();
        }

        double somme = 0;
        double max = notes[0];
        double min = notes[0];

        for (int i = 0; i < n; i++) {
            somme += notes[i];

            if (notes[i] > max) {
                max = notes[i];
            }

            if (notes[i] < min) {
                min = notes[i];
            }
        }

        double moyenne = somme / n;

        System.out.println("\nRésultats de la classe :");
        System.out.println("Somme des notes : " + somme);
        System.out.println("Note maximale : " + max);
        System.out.println("Note minimale : " + min);
        System.out.println("Moyenne de la classe : " + moyenne);
    }
}
