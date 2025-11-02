package exercice3;

import java.util.Scanner;

public class TableauSommes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saisis la taille du tableau : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            int somme = 0;
            for (int j = 0; j <= i; j++) {
                somme += j;
            }
            tab[i] = somme;
        }
        System.out.println("Tableau des sommes :");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}

