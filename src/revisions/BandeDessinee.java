package revisions;

public class BandeDessinee extends Livre {
	
	public boolean couleur;
	public String dessinateur;

	public BandeDessinee(String titre, int nbPages) {
		super(titre, nbPages, "Auteur de BD");
	}
	
	public BandeDessinee(String titre, int nbPages, String auteur) {
		super(titre, nbPages, auteur);
	}

}
