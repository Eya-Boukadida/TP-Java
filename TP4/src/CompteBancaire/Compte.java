package CompteBancaire;

import java.util.Scanner;

//Classe représentant un compte bancaire
public class Compte {

 // Attribut représentant le solde du compte
 public Double solde;

 // Constructeur avec paramètre solde
 public Compte(Double solde) {
     this.solde = solde;
 }

 // Méthode pour gérer les dépôts (versements)
 public void deposer(Double montant) {
     solde += montant;
     System.out.println("Dépôt de " + montant + " effectué. Nouveau solde : " + solde);
 }

 // Méthode pour gérer les retraits
 public void retirer(Double montant) {
     if (montant > solde) {
         System.out.println("Solde insuffisant.");
     } else {
         solde -= montant;
         System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + solde);
     }
 }

 // Méthode pour afficher le solde du compte
 public void afficher() {
     System.out.println("Solde actuel : " + solde);
 }

 // Méthode main pour tester (fard classe)
 public static void main(String[] args) {

     // Création d'un scanner pour la saisie utilisateur
     Scanner scanner = new Scanner(System.in);

     // Création d'un compte avec un solde initial de 1000
     Compte compte = new Compte(1000.0);

     // Affichage du solde initial
     compte.afficher();

     // Demande de saisir le montant à déposer
     System.out.print("Entrez le montant à déposer : ");
     Double montantDepot = scanner.nextDouble();
     compte.deposer(montantDepot);

     // Demande de saisir le montant à retirer
     System.out.print("Entrez le montant à retirer : ");
     Double montantRetrait = scanner.nextDouble();
     compte.retirer(montantRetrait);

     // Affichage du solde final
     compte.afficher();
 }
}



