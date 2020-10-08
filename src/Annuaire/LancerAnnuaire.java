package Annuaire;

public class LancerAnnuaire {

	public static void main(String[] args) {
		
		Contact ami = new Contact("Thomas", "Aldaitz", "06732739237", "taldaitz@dawan.fr", 35);	
		System.out.println( ami.sePresenter());
		
		
		
		Contact frere = new Contact("Guillaume", "Aldaitz", "06323686876");
		System.out.println( frere.sePresenter());
		
		
		Contact collegue = new Contact("Jean", "Test", "063908098");
		System.out.println( collegue.sePresenter());
		System.out.println( collegue.getEmail());
		
		collegue.setEmail("jtest@dawan.fr");
		
		System.out.printf("Nombre de contact : %s\n", Contact.getNbContact());

	}

}
