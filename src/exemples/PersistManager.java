package exemples;

import java.io.*;
import java.util.ArrayList;

import Annuaire.Contact;

public class PersistManager {

	public static void main(String[] args) {
		
		
		//sauvegarder(text);
		//String textARecup = lireFichier();
		
		//System.out.println(textARecup);

	}
	
	
	public static void sauvegarder(String text) {
		try {
			FileWriter writer = new FileWriter("exemple.txt", true);
			
			writer.write(text);
			writer.write("\n");
			
			writer.close();
		} 
		catch(Exception ex) {
			System.out.println("Un problème est survenue.");
		}
		
	}
	
	public static ArrayList<String> lireFichier() {
		ArrayList<String> lignes = new ArrayList<String>();
		
		
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		Contact contact = new Contact("Thomas", "Aldaitz", "09890809328");
		
		contacts.add(contact);
		
		try {
			FileReader reader = new FileReader("exemple.txt");
			BufferedReader bfReader = new BufferedReader(reader);
			
			while(bfReader.ready()) {
				lignes.add(bfReader.readLine());
			}
			
			bfReader.close();			
			
		}
		catch(Exception ex) {
			System.out.println("Un problème est survenue pendant la lecture du fichier.");
		}
		
		return lignes;
		
	}

}
