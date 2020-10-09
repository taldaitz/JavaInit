package Annuaire;

import java.util.ArrayList;
import java.util.Scanner;

public class LancerMenu {

	public static void main(String[] args) {
		
		loop : while(true) {
			System.out.println("Selectionnez une option :");
			System.out.println("1 - Créer un contact");
			System.out.println("2 - Voir tous les contacts");
			System.out.println("0 - Quitter");
			
			String option = new Scanner(System.in).next();
			
			if(option == "0") break;
			
			switch(option) {
				
			case "1" :
				creerContact();
				break;
				
			case "2" :
				voirContact();
				break;
			
			}
		}

	}
	
	public static void creerContact() {
		System.out.println("Saisir le prénom : ");
		String prenom = new Scanner(System.in).next();
		
		System.out.println("Saisir le nom : ");
		String nom = new Scanner(System.in).next();
		
		System.out.println("Saisir le age : ");
		int age = Integer.parseInt(new Scanner(System.in).next());
		
		System.out.println("Saisir l'email : ");
		String email = new Scanner(System.in).next();
		
		System.out.println("Saisir le téléphone : ");
		String telephone = new Scanner(System.in).next();
		
		
		Contact contact = new Contact(prenom, nom, telephone, email, age);
		contact.sauvegarder();
		
		System.out.println("Contact sauvegardé !\n\n");
	}
	
	public static void voirContact() {
		
		ArrayList<Contact> contacts = Contact.chargerContacts();
		
		for(Contact contact : contacts) {
			System.out.println("**********************");
			
			System.out.printf("Prénom : %s\n", contact.getPrenom());
			System.out.printf("Nom : %s\n", contact.getNom());
			System.out.printf("Age : %s\n", contact.getAge());
			System.out.printf("Email : %s\n", contact.getEmail());
			System.out.printf("Téléphone : %s\n", contact.getTelephone());
			
			System.out.println("**********************");
		}
		
	}

}
