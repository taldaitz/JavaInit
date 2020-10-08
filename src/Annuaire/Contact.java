package Annuaire;

public class Contact {

	private String nom;
	private String prenom;
	private int age;
	private String email;
	private String telephone;
	
	private static int nbContacts;
	
	public Contact() {
		
	}
	
	public Contact(String prenom, String nom, String telephone) {
		this.prenom = prenom;
		this.nom = nom;
		this.telephone = telephone;
		
		nbContacts++;
	}
	
	
	public Contact(String prenom, String nom, String telephone, String email, int age) {
		
		this(prenom, nom, telephone); //appel au constructeur au dessus
		
		this.email = email;
		this.age = age;
	}
	
	
	protected String sePresenter() {		
		return String.format("Je m'appelle %s %s et je suis joignable au %s.", 
				this.prenom, this.nom, this.telephone);
	}
	
	public void setEmail(String email) {
		
		if(email.contains("@")) {
			this.email = email;
		}
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public static int getNbContact() {
		return nbContacts;
	}
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		
		this.age = age;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
