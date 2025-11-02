package exercice2;

import java.util.Scanner;

public class RechercheTableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien d'éléments veux-tu dans le tableau ? ");
        int taille = sc.nextInt();

        int[] tab = new int[taille];

        for (int i = 0; i < tab.length; i++) {
            System.out.print("Entier pour l'indice " + i + " : ");
            tab[i] = sc.nextInt();
        }

        System.out.print("Saisis un entier à rechercher : ");
        int n = sc.nextInt();

        int dernierIndice = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == n) {
                dernierIndice = i; 
            }
        }

        if (dernierIndice != -1) {
            System.out.println("L'entier " + n + " se trouve à l'indice " + dernierIndice);
        } else {
            System.out.println("L'entier " + n + " n'est pas dans le tableau.");
        }
    }
}


