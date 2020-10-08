package exo02;

import java.util.Scanner;

public class ExoBoucle {

	public static void main(String[] args) {

		//civiliteLoop();
		quadrillage();
		
	}
	
	static void civiliteLoop() {
		System.out.println("Saisir votre civilité : ");
		
		loop : do {
			String civilite = new Scanner(System.in).next();
			
			switch(civilite) {
				
			case "Mme" :
				System.out.println("Vous avez un joli chapeau.");
				break loop;
			
			case "Mr" :
				System.out.println("Vous avez une jolie moustache.");
				break loop;
				
			case "Dr" :
				System.out.println("Quoi de neuf ?");
				break loop;
				
			default :
				System.out.println("Civilité non reconnue.Veuillez en saisir une nouvelle :");		
			}
		} while(true);
	}

	
	static void quadrillage() {
		
		System.out.println("Saisir des dimensions :");
		int nbLignes = Integer.parseInt(new Scanner(System.in).next());
		int nbColonnes = Integer.parseInt(new Scanner(System.in).next());
		
		for(int j = 0; j < nbLignes; j++) {
			for(int i = 0 ; i < nbColonnes; i++) {
				System.out.print("[]");
			}
			
			System.out.print("\n");
		}
	}
}
