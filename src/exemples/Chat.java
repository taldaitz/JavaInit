package exemples;

public class Chat {
	
	public String nom;
	public int age;
	public int poids;
	public String couleur;
	
	public Chat(String nom, int age) {
		this.nom = nom;
		this.age = age;
		
		this.couleur = "Noir";
	}
	
	
	public void miauler() {
		System.out.printf("%s(%s ans) dit Miaou !\n", this.nom, this.age);
	}
	

}
