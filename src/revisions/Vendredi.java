package revisions;

import java.util.ArrayList;
import java.util.Date;

public class Vendredi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom = "Thomas";
		
		String nomMaj = nom.toUpperCase(); // THOMAS
	
		
		Livre bouquin = new Livre("Les misérables", 850, "Victor Hugo");
		
		bouquin.resume = "Livre pas trés joyeux";
		bouquin.dateParution = new Date(1870, 05, 27);
		
		BandeDessinee bd = new BandeDessinee("Astérix", 56);
		bd.auteur = "Uderzo";
		bd.couleur = true;
		
		
		ArrayList<Livre> bibli = new ArrayList<Livre>();
		bibli.add(bouquin);
		bibli.add(bd);
		
		
		rangerLivre(bouquin);
		//rangerLivre("Livre"); -- interdit !!
		rangerLivre(bd);
	}
	
	public static void rangerLivre(Livre book) {
		//traitement de rangement de livre
	}

}
