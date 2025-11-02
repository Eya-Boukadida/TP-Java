package exercice1;

import java.util.Scanner;

public class Tableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tableau = new int[5];

        
        System.out.println("Remplis le tableau avec 5 nombres :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Nombre " + (i+1) + " : ");
            tableau[i] = sc.nextInt();
        }

        System.out.println("Contenu initial du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[i] > tableau[j]) {
                    // échange
                    int temp = tableau[i];
                    tableau[i] = tableau[j];
                    tableau[j] = temp;
                }
            }
        }

        System.out.println("Tableau après tri :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
}

