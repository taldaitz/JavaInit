package helloWorld;

import java.util.Scanner;

public class Lanceur {

	public static void main(String[] args) {
		
		
		
		//direBonjour();
		calculerSomme();

	}
	
	static void direBonjour() {
		
		System.out.println("Veuillez saisir votre nom : ");
		
		String nom;
		nom = new Scanner(System.in).next();
		
		System.out.println("Veuillez saisir votre prénom : ");
		
		String prenom = new Scanner(System.in).next();
		
		//System.out.println("Bonjour " + prenom + " " + nom ); equivalent
		System.out.printf("Bonjour %s %s", prenom, nom);
		
	}
	
	static void calculerSomme() 
	{
		
		System.out.println("Saisir deux chiffres");
		String chiffreUnStr = new Scanner(System.in).next();
		String chiffreDeuxStr = new Scanner(System.in).next();
		
		int chiffre1 = Integer.parseInt(chiffreUnStr);
		int chiffre2 = Integer.parseInt(chiffreDeuxStr);
		
		System.out.printf("La somme est %s", chiffre1 + chiffre2);
		
	}

}
