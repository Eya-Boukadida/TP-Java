package surface;

public class rectangle {
    // Attributs
    double longueur;
    double largeur;

    // Constructeur
    public rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Méthode pour calculer la surface
    public double calculerSurface() {
        return longueur * largeur;
    }
}

