package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class ProbarFutbolista {

	public static void main(String[] args) {
		
		ArrayList<Futbolista> miLista= new ArrayList<>();
		
		//agrego objetos al array
		miLista.add(new Futbolista("33333333J","Paula Gomez", 44,200));
		miLista.add(new Futbolista("11111111F","Benzema", 25,100));
		miLista.add(new Futbolista("22222222H","Carlos Gomez", 30,200));
		miLista.add(new Futbolista("11111111A","Pepito Perez", 26,1000));
		miLista.add(new Futbolista("33333333J","Aitor Gomez", 30,200));
		
		//hago la ordenación natural
		Collections.sort(miLista, new ComparadorFutbolista2());
		//recorrer el array
		for (Futbolista jugador:miLista) {
			System.out.println(jugador.toString());
		}
		
		
	}
}
