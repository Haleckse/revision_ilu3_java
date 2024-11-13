package revision_ilu3_java;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Tas <T> implements Iterable<T>{
	private T[] tas; 
	private int nombreEltTas = 0;
	private int nombreOperation = 0; 
	
	@SuppressWarnings("unchecked")
	public Tas() {
	    this.tas = (T[]) new Object[30]; // Création d'un tableau générique avec un cast
	}

	@Override
	public Iterator<T> iterator() {
		return new iterateur<T>(); 
	}
	
	public void ajouterElt(T elt) {
		tas[nombreEltTas] = elt; 
		nombreEltTas++;
	}
	
	private class iterateur<T> implements Iterator{
		private int nombreOperationReference = 0; 
		private int indice = 0; 
		private boolean nextEffectue = false; 
		
		@Override
		public boolean hasNext() {
			if(nombreEltTas < 1) {
				return false; 
			}
			else {
				return indice < nombreEltTas; 
			}
		}
		
		@Override
		public T next() {
			T elt = (T) tas[indice]; 
			indice++; 
			return elt; 
		}
		
		@Override
		public void remove() {
			if(!nextEffectue) throw new IllegalStateException(); 
			else {
				for (int i = indice; i < nombreEltTas-1; i++) {
					tas[i] = tas[i+1]; 
				}
				nombreEltTas--; 
			}
		}
		
		
	}
		
}	
