package Rectangle;

public class Rectangle { 

    private Double longueur; 
    private Double largeur; 

    public Rectangle(Double longueur, Double largeur) { 
        this.longueur = longueur; 
        this.largeur = largeur; 
    } 

    public Double surface() { 
        return longueur * largeur; 
    } 

    public Double perimetre() { 
        return 2 * (longueur + largeur); 
    } 

    public void afficher() { 
        System.out.println("Longueur : " + longueur);
        System.out.println("Largeur  : " + largeur);
        System.out.println("Surface du rectangle : " + surface()); 
        System.out.println("Périmètre du rectangle : " + perimetre()); 
    } 
}

