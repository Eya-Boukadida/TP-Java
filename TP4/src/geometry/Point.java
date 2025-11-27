package geometry;

public class Point {

    public Double abscisse;
    public Double ordonnee;

    public Point(Double abscisse, Double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public void afficher() {
        System.out.println("Point = (" + abscisse + ", " + ordonnee + ")");
    }
}

