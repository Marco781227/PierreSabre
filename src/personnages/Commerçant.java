package personnages;

public class Commerçant extends Humain {

	public Commerçant(String nom, int argent) {
		super(nom, "thé",argent);
	}
	
	public int seFaireExtorquer() {
		
		int preArgent=argent;
		argent=0;
		parler("J'ai tout perdu! Le monde est trop injuste...");
		
		return preArgent;
		
	}
	
	public void recevoir (int monnaie) {
		argent+=monnaie;
		parler(monnaie+" sous ! Je te remercie généreux donateur!");
	}
	

	
	
}
