package poligonos;

import java.util.Comparator;

public class CriteriosOrdenacion {
	

}


class OrdenarPoligonos implements Comparator<Poligono> {

	@Override
	public int compare(Poligono o1, Poligono o2) {
		int resultado;
		if (o1.getNum_lados() <o2.getNum_lados()) {
			resultado=-1;
		} else if (o1.getNum_lados() > o2.getNum_lados()) {
			resultado=+1;
		} else { // si tienen igual  número de lados...
			//decidir en función de la longitud del lado
			Double longitud1= Double.valueOf(o1.getLado());
			Double longitud2= Double.valueOf(o2.getLado());
			resultado= longitud1.compareTo(longitud2);
			
//			if (o1.getLado()<o2.getLado()) {
//				resultado=-1;
//			} else if ( o1.getLado() > o2.getLado()){
//				resultado=+1;
//			} else {
//				resultado=0;
//			}
			
			
		}
		return resultado;
	} //fin del método

} //fin de la clase OrdenarPoligonos


class OrdenarPoligonos2 implements Comparator<Poligono> {

	@Override
	public int compare(Poligono o1, Poligono o2) {
		int resultado;
		
		//1ª criterio: ordenar por la longitud del lado
		
		if (o1.getLado()<o2.getLado()) {
			resultado=-1;
			
		} else {
			if (o1.getLado()>o2.getLado()) {
				resultado=+1;
			} else {
				//2ª criterio: ordenar por el número de lados
				if (o1.getNum_lados()<o2.getNum_lados()) {
					resultado=-1;
				} else {
					if (o1.getNum_lados()>o2.getNum_lados()) {
						resultado=+1;
					} else {
						resultado=0;
					}
				}
			}
		}
		return resultado;
	}
}//fin de la clase OrdenarPoligonos2

class OrdenarPoligonos3 implements Comparator<Poligono> {

	@Override
	public int compare(Poligono o1, Poligono o2) {
		int resultado;

		// 1ª criterio:ordeno primero por el perímetro
		if (o1.damePerimetro() < o2.damePerimetro()) {
			resultado = -1;
		} else if (o1.damePerimetro() > o2.damePerimetro()) {
			resultado = +1;
		} else {
			// 2º criterio: ordeno por el número de lados
			if (o1.getNum_lados() < o2.getNum_lados()) {
				resultado = -1;
			} else if (o1.getNum_lados() > o2.getNum_lados()) {
				resultado = +1;
			} else {
				resultado = 0;
			}

		
		}
		
		return resultado;
	}//fin del método
	
} //fin de la clase OrdenarPoligonos3


