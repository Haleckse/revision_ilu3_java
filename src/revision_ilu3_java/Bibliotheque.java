package revision_ilu3_java;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	private List<Gaulois> emprunteurs = new ArrayList<>();
	private List<Etagere> etageres = new ArrayList<>();
	
	public void ajouterEmprunteur(Gaulois gaulois) {
		if(!emprunteurs.contains(gaulois)) {
			emprunteurs.add(gaulois); 
		}
		
	}
}
