package revisions;

public class Jeudi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phrase; //d�claration variable
		phrase = "Formation Java"; //affectation variable
		
		
		int i = 9; // Initialisation = d�claration + affectation
		
		
		afficherMultiple(phrase, i);
	}
	
	static void afficherMultiple(String phrase, int chiffre) {
		
		if( chiffre < 1 ) {
			System.out.println("On ne peut r�peter qu'un nombre de fois sup�rieur � z�ro.");
		} else {
		
			int compteur = 0;
			do {
				//compteur = compteur + 1;
				compteur++;
				
				System.out.println(compteur + " - " + phrase);
				
			} while(compteur < chiffre);
			
			
			System.out.println();
			
			
			for(int i = 0; i < chiffre; i++) {
				System.out.println(i + " - " + phrase);
			}
			
			
		}
		
	}

}
