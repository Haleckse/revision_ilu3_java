package revision_ilu3_java;

public class Gaulois {
	private String nom; 
	
	public Gaulois(String nom) {
		this.nom = nom; 
	}
	
	public void rendreParchemin (Parchemin... tableau) {
		for(Parchemin p : tableau) {
			System.out.println(this.nom + " a rendu " + p);
		}
	}
}
