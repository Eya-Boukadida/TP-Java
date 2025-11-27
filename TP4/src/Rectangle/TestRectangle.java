package Rectangle;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Saisie utilisateur
        System.out.print("Entrez la longueur du rectangle : ");
        Double longueur = scanner.nextDouble();

        System.out.print("Entrez la largeur du rectangle : ");
        Double largeur = scanner.nextDouble();

        // Création du rectangle avec les valeurs saisies
        Rectangle monRectangle = new Rectangle(longueur, largeur);

        // Affichage des résultats
        monRectangle.afficher();

        scanner.close(); // fermer le scanner (bonne pratique)
    }
}


