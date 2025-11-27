package geometry;

public class Cercle {

    private Point centre;
    private Double rayon;

    public Cercle(Point centre, Double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Double perimetre() {
        return 2 * Math.PI * rayon;   // π = Math.PI
    }

    public Double surface() {
        return Math.PI * rayon * rayon;
    }

    public void afficher() {
        centre.afficher();
        System.out.println("Rayon       : " + rayon);
        System.out.println("Périmètre   : " + perimetre());
        System.out.println("Surface     : " + surface());
    }
}

