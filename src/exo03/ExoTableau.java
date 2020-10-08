package exo03;

public class ExoTableau {

	public static void main(String[] args) {
		
		int[] chiffres = {-89, 49, -6, 109, 625, 2, -78, 56, -8, 46};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int somme = 0;
		
		for(int chiffre : chiffres) {
			
			if(chiffre < min) 
				min = chiffre;
			
			if(chiffre > max)
				max = chiffre;
			
			somme += chiffre; // somme = somme + chiffre;
		}
		
		System.out.printf("Valeur minimale : %s\n", min);
		System.out.printf("Valeur maximale : %s\n", max);
		System.out.printf("Valeur moyenne : %s\n", (double)somme / chiffres.length);

	}

}
