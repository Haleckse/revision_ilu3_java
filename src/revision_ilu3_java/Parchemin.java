package revision_ilu3_java;

public class Parchemin implements Comparable<Parchemin>{
	private int annee;
	 private String titre; 
	 
	 public Parchemin(int annee, String titre) {
		 this.annee = annee;
		 this.titre = titre;
	 }
	 
	public String getTitre() {
		return this.titre; 
	}
	
	public int getAnnee() {
		return this.annee; 
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(annee); 
		sb.append(','); 
		sb.append(titre); 
		return sb.toString(); 
	}
		
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Parchemin) {
			Parchemin p = (Parchemin) obj;
			return ( (this.titre.equals(p.titre)) && (this.annee == p.getAnnee() ) ); 
		}
		return false; 
		
	}

	@Override
	public int compareTo(Parchemin o) {
		int comparaison =  this.annee - o.getAnnee(); 
		if (comparaison == 0) comparaison = this.titre.compareTo(o.getTitre());
		
		return comparaison; 
	}

}
