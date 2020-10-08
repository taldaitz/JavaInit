package exemples;

import Annuaire.Contact;

public class LancerChat {

	public static void main(String[] args) {
		
		Chat felix = new Chat("Félix", 5);
		
		// Classe nom_variable = new Constructeur_De_La_Classe();
		
		
		Chat matou = new Chat("Robert", 8);
		
		Contact ami = new Contact("Thomas", "Aldaitz", "06732739237", "taldaitz@dawan.fr", 35);	
	
		
		
		felix.poids = 6;
		felix.couleur = "Gris";
		
		felix.miauler();
		
		
		
		
		matou.nom = "Robert";
		
		matou.miauler();
		
		
	}

}
