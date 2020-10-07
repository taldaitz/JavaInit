package exo01;

import java.util.Scanner;

public class ExoCondition {

	public static void main(String[] args) {
		
		//civilite();
		pairOuImpair();

	}
	
	static void civilite() {
		
		System.out.println("Saisir votre civilité : ");
		String civilite = new Scanner(System.in).next();
		
		switch(civilite) {
			
		case "Mme" :
			System.out.println("Vous avez un joli chapeau.");
			break;
		
		case "Mr" :
			System.out.println("Vous avez une jolie moustache.");
			break;
			
		case "Dr" :
			System.out.println("Quoi de neuf ?");
			break;
			
		default :
			System.out.println("Civilité non reconnue.");
		
		}
		
	}
	
	static void pairOuImpair() {
		
		System.out.println("Saisir votre chiffre :");
		int chiffre = Integer.parseInt(new Scanner(System.in).next());
		
		if(chiffre % 2 == 0) {
			System.out.println("Pair");
		} else {
			System.out.println("Impair");
		}
		
	}

}
