package operation3nbrs;

import java.util.Scanner;

public class operation3nbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("donne le premier nombre : ");
		int nb1 = input.nextInt();
		
		System.out.print("donner le deuxieme nombre : ");
		int nb2 =input.nextInt();
		
		System.out.print("donner le troisieme nombre");
		int nb3 = input.nextInt();
		
		int somme = nb1 + nb2 + nb3;
		int produit = nb1 * nb2 * nb3;
		double moyenne = somme / 3 ;
		
		System.out.println("la somme est : " + somme);
		System.out.println("le produit est : " + produit);
		System.out.println("la moyenne est : " + moyenne);

	}

}
