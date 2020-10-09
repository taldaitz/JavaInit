package exemples;

import java.util.ArrayList;

public class Tableau {

	public static void main(String[] args) {
		
		int[] chiffres = new int[5];
		
		chiffres[0] = 6; 
		chiffres[1] = 8;
		chiffres[2] = 12;
		chiffres[3] = 19;
		chiffres[4] = 34;
		
		for(int chiffre : chiffres) {
			System.out.println(chiffre);
		}
		
		
		String[] noms = {"Toto", "Titi", "Tata"};
		
		//noms[0] == "Toto"
		//noms[1] == "Titi"
		//noms[2] == "Tata"
		
		for(String nom : noms) {
			System.out.println(nom);
		}
		
		mini(chiffres);
		
		
		ArrayList<String> contacts = new ArrayList<String>();
		contacts.add("Thomas");
		contacts.add("Robert");
		contacts.add("Jean");
		
		for(String nom : contacts) {
			System.out.println(nom);
		}
		
		

	}
	
	static int mini(int[] nombres) {
		for(int nombre : nombres) {
			
		}
		return 0;
	}

}
