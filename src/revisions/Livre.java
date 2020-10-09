package revisions;

import java.util.Date;

public class Livre {

	public String titre;
	public String resume;
	public int nbPages;
	public Date dateParution;
	public String auteur;
	
	public Livre(String titre, int nbPages, String auteur) {
		this.titre = titre;
		this.nbPages = nbPages;
		this.auteur = auteur;
	}
	
}
