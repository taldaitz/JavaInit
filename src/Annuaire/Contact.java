package Annuaire;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;

public class Contact {

	private String nom;
	private String prenom;
	private int age;
	private String email;
	private String telephone;
	
	private static int nbContacts;
	
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
	
	public String toCSV() {
		return String.format("%s;%s;%s;%s;%s\n", this.nom, this.prenom, this.age, this.telephone, this.email);
	}
	
	
	
	public void sauvegarder() {
		try {
			
			FileWriter writer = new FileWriter("annuaire.csv", true);
			
			writer.write(this.toCSV());
			
			writer.close();
			
		}
		catch(Exception ex) {
			System.out.println("Une erreur est survenue lors de l'enregistrement du contact");
		}
	}
	
	public static Contact getContactFromCSV(String csv) {
		String[] parties = csv.split(";");
		
		return new Contact(parties[1], parties[0], parties[3], 
				parties[4], Integer.parseInt(parties[2]));
	}
	
	public static ArrayList<Contact> chargerContacts() {
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		try {
			
			FileReader reader = new FileReader("annuaire.csv");
			BufferedReader br = new BufferedReader(reader);
			
			while(br.ready()) {
				
				String ligne = br.readLine();
				
				Contact contact = Contact.getContactFromCSV(ligne);
				
				contacts.add(contact);
			}
			
			br.close();
			
		}
		catch(Exception ex) {
			System.out.println("Une erreur est survenue lors du chargement des contacts.");
		}
		
		return contacts;
	}
}
