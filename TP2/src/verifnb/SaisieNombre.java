package verifnb;

import java.util.Scanner;

public class SaisieNombre {
    public static Integer demanderNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        String saisie = sc.nextLine();

        try {
            int nombre = Integer.parseInt(saisie); // Vérifie si c’est bien un entier
            return nombre;
        } catch (NumberFormatException e) {
            System.out.println("Erreur : la saisie n'est pas un nombre entier !");
            return null; // renvoie null si la saisie est invalide
        }
    }
}

