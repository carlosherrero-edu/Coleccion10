package ejercicio6;

import java.util.Comparator;

public class ComparadorFutbolista implements Comparator<Futbolista> {

	@Override
	

	public int compare(Futbolista o1, Futbolista o2) {
		return (-1)*o1.getNombre().compareTo(o2.getNombre());
			
		
	}
}
