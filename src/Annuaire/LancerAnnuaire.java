package Annuaire;

public class LancerAnnuaire {

	public static void main(String[] args) {
		
		Contact ami = new Contact("Thomas", "Aldaitz", "06732739237", "taldaitz@dawan.fr", 35);
		Contact frere = new Contact("Guillaume", "Aldaitz", "06323686876");
		Contact collegue = new Contact("Jean", "Test", "063908098");
		
		ContactPro fournisseur = new ContactPro("Robert", "Du Test", "09327837297", "Lyon", "Dawan");
	
		
		Contact[] annuaire = { ami, frere, collegue, fournisseur };
		
		for(Contact contact : annuaire) {
			
			System.out.println(contact.sePresenter());
			
		}
		
		

	}

}
