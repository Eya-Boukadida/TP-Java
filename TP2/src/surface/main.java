package surface;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		cercle c2 =new cercle(5.2);
		System.out.println("Le rayon de cercle 2 est : " + c2.r);
		System.out.println("La surface du cercle est : " + c2.calculersurface());
		

		System.out.print("entrer le rayon de cercle : ");
		double r = input.nextDouble();
		cercle c1 = new cercle(r);
		System.out.println("La surface du cercle est : " + c1.calculersurface());
		
		//lang=new rectangle(3);
		//System.out.print("Entrez la longueur du rectangle : ");
		//larg=new rectangle(5);
		//System.out.print("Entrez la largeur du rectangle : ");
		System.out.print("Entrez la longueur du rectangle : ");
        double longueur = input.nextDouble();

        System.out.print("Entrez la largeur du rectangle : ");
        double largeur = input.nextDouble();

        rectangle r1 = new rectangle(longueur, largeur);
       
		System.out.println("La surface du rectangle est : " + r1.calculerSurface());
	
       
	}
	
}
