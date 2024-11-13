package revision_ilu3_java;

import java.util.Comparator;

public class comparatorParchemin implements Comparator<Parchemin>{
	
	
	@Override
	public int compare(Parchemin p1, Parchemin p2){
		return p1.getTitre().compareTo(p2.getTitre()); 
	}

}
