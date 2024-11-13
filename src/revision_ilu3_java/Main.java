package revision_ilu3_java;

import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;


public class Main {
	
	
	
	 public static void main(String[] args) {
//		 
//		 Comparator<Parchemin> comparatorParchemin = new Comparator<Parchemin>() {
//			 @Override
//			 public int compare(Parchemin p1, Parchemin p2) {
//				 return p1.getTitre().compareTo(p2.getTitre()); 
//			 }
//		 }; 
		 
		 Parchemin p1 = new Parchemin(1998, "La guerre des Gaulles"); 
		 Parchemin p2 = new Parchemin(1997, "Django unchained"); 
		 Parchemin p3 = new Parchemin(1996, "Seul sur Mars"); 

		 
		 NavigableSet <Parchemin> parchemins = new TreeSet<>(new comparatorParchemin());
		 parchemins.add(new Parchemin(5, "apple")); 
		 parchemins.add(new Parchemin(2, "xqc")); 
		 parchemins.add(new Parchemin(4, "billy")); 
		 
		 
		 NavigableSet <Parchemin> parcheminsDates = new TreeSet<>();
		 parcheminsDates.add(new Parchemin(1, "apple")); 
		 parcheminsDates.add(new Parchemin(2, "xqc")); 
		 parcheminsDates.add(new Parchemin(4 , "billy"));
		 
		 System.out.println("Affichage dans l'ordre alphabetique");
		 Iterator<Parchemin> it = parchemins.iterator(); 
		 while(it.hasNext()) {
			 Parchemin p = it.next(); 
			 System.out.println(p);
		 }
		 
		 
		 System.out.println("\n Affichage dans l'ordre de parution");
		 Iterator<Parchemin> it2 = parcheminsDates.iterator(); 
		 while(it2.hasNext()) {
			 Parchemin p = it2.next(); 
			 System.out.println(p);
		 }
		 
		 
		 Gaulois asterix = new Gaulois("Asterix"); 
		 asterix.rendreParchemin(p1, p2);
		 
		 
		 
		 //HASH MAPS (dictionaires)
		 System.out.println("\n--------LES HASH MAPS--------");
		 
		 Musee musee = new Musee(); 
		 musee.ajouter(p1);
		 musee.ajouter(p2);
		 
		 System.out.println("Un musée avec deux Parchemins sans appreciations : ");
		 musee.afficherMusee();
		 
		 System.out.println("\nUn musée avec deux Parchemins avec deux appreciation sur Django");
		 musee.ajouterAppreciation(p2, new Appreciation("Incroyable") ); 
		 musee.ajouterAppreciation(p2, new Appreciation("Mashallah") );
		 musee.afficherMusee();
		 
		 System.out.println("\nUn musée avec deux Parchemins avec deux appreciation sur Django et on ajoute une appreciation sur un parchemin non présent");
		 musee.ajouterAppreciation(p3, new Appreciation("Sah quel plaisir") );
		 musee.afficherMusee();
		 
		 
		 //LES ITERATEURS
		 System.out.println("--------LES ITERATEURS");
		 
		 Tas <Parchemin> tas = new Tas<>(); 
		 Iterator<Parchemin> itP = tas.iterator(); 
//		 
		 tas.ajouterElt(p1);
		 tas.ajouterElt(p2);
		 tas.ajouterElt(p3);
		 
		 while(itP.hasNext()) {
			 Parchemin p = itP.next(); 
			 System.out.println(p);
		 }
		 
//		 System.out.println("\nSuppresion du premier element du tas");
//		 Iterator<Parchemin> itP2 = tas.iterator();
//		 itP2.next(); 
//		 itP2.remove(); vb 
//		 
//		 while(itP2.hasNext()) {
//			 Parchemin p = itP2.next(); 
//			 System.out.println(p);
//		 }
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		 
	 }
	 
	 
}
