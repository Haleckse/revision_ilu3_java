package revision_ilu3_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Musee {
	
	private Map<Parchemin, List <Appreciation> > ParcheminsApprecies; 
	
	public Musee() {
		Map<Parchemin, List<Appreciation> > map = new HashMap<>(); 
		this.ParcheminsApprecies = map; 
	}
	
	public void ajouter(Parchemin p) {
		if (!ParcheminsApprecies.containsKey(p)) {
			ParcheminsApprecies.put(p, new ArrayList<Appreciation>()); 
		}
		
	 }
	 
	public void afficherMusee() {
		System.out.println(ParcheminsApprecies);
	}
	 
	
	
	public void ajouterAppreciation(Parchemin p, Appreciation a) {
		if (!ParcheminsApprecies.containsKey(p)) {
			List<Appreciation> newList = new ArrayList<>(); 
			newList.add(a); 
			ParcheminsApprecies.put(p, newList); 
		}
		else {
			ParcheminsApprecies.get(p).add(a); 
		}
	}
}
