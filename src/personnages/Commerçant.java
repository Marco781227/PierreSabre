package personnages;

public class Commer�ant extends Humain {

	public Commer�ant(String nom, int argent) {
		super(nom, "th�",argent);
	}
	
	public int seFaireExtorquer() {
		
		int preArgent=argent;
		argent=0;
		parler("J'ai tout perdu! Le monde est trop injuste...");
		
		return preArgent;
		
	}
	
	public void recevoir (int monnaie) {
		argent+=monnaie;
		parler(monnaie+" sous ! Je te remercie g�n�reux donateur!");
	}
	

	
	
}
