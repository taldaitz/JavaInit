package Annuaire;

public class ContactPro extends Contact {
	
	private String ville;
	private String societe;

	public ContactPro(String prenom, String nom, String telephone, String ville, String societe) {
		super(prenom, nom, telephone);
		
		this.ville = ville;
		this.societe = societe;
	}
	
	
	protected String sePresenter() {
		return super.sePresenter() + String.format("Je travail pour %s à %s", this.societe, this.ville);
	}
}
