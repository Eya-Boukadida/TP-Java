package somme2nbrs;

import java.util.Scanner;

public class somme2nbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Entrez le premier nombre : ");
		int nb1 = input.nextInt();
			
		System.out.print("Entrez le deuxieme nombre : ");
		int nb2 = input.nextInt();
			
		int somme= nb1 + nb2;
			
		System.out.print("la somme est :" + somme);

	}

}
