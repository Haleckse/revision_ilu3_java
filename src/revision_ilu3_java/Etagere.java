package revision_ilu3_java;

import java.util.ArrayList;
import java.util.List;

public class Etagere {
	List <Parchemin> etagere = new ArrayList<>(); 
	
	void ajouterTete(Parchemin p) {
		etagere.add(0, p); 
	}
	
	void ajouterFin(Parchemin p) {
		etagere.add(p); 
	}
	
	void rem(String nom) {
		etagere.remove(new Parchemin(4, nom)); 
	}
	
	void afficherEtagere() {
		System.out.println(etagere);
	}
	
	
}
