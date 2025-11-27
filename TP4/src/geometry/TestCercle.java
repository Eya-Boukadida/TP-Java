package geometry;

import java.util.Scanner;

public class TestCercle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Saisie du centre
        System.out.print("Entrez l'abscisse du centre : ");
        Double x = scanner.nextDouble();

        System.out.print("Entrez l'ordonnée du centre : ");
        Double y = scanner.nextDouble();

        // Création du point centre
        Point centre = new Point(x, y);

        // Saisie du rayon
        System.out.print("Entrez le rayon du cercle : ");
        Double rayon = scanner.nextDouble();

        // Création du cercle
        Cercle c = new Cercle(centre, rayon);

        // Affichage des résultats
        c.afficher();

        scanner.close();
    }
}

