package poligonos;

public class Poligono implements Comparable<Poligono> {

	// propiedades
	private int num_lados;
	private double lado;

	// constructores
	public Poligono(int num_lados, double lado) {
		try {
			this.setLado(lado);
			this.setNum_lados(num_lados);
		} catch (Exception e) {
			throw e;
		}
	}

	public void setNum_lados(int num_lados) {
		if (num_lados < 3) {
			throw new IllegalArgumentException("El poligono debe tener al menos 3 lados");
		}
		this.num_lados = num_lados;
	}

	public int getNum_lados() {
		return num_lados;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if (lado <= 0.0) {
			throw new IllegalArgumentException("El lado debe ser mayor de 0");
		}
		this.lado = lado;
	}

	public double damePerimetro() {
		return getNum_lados() * getLado();
	}

	@Override
	public String toString() {
		return " [Lados: " + getNum_lados() + " * Perimetro: " + damePerimetro() + "]";
	}

	@Override
	public boolean equals (Object o) {
		boolean sonIguales=false;
		
		if (o instanceof Poligono) {
			//hacemos conversión descendente
			Poligono otroP=(Poligono)o;
			if (this.getNum_lados()==otroP.getNum_lados() && this.getLado()==otroP.lado) {
				sonIguales=true;
			}
			
		}
		return sonIguales;
	}
	
	@Override
	public int compareTo(Poligono o) {
		int resultado;
		if (this.getNum_lados() <o.getNum_lados()) {
			resultado=-1;
		} else if (this.getNum_lados() > o.getNum_lados()) {
			resultado=+1;
		} else { // si tienen igual  número de lados...
			//decidir en función de la longitud del lado
			Double longitud1= Double.valueOf(this.getLado());
			Double longitud2= Double.valueOf(o.getLado());
			resultado= longitud1.compareTo(longitud2);
			
//			if (this.getLado()<o.getLado()) {
//				resultado=-1;
//			} else if ( this.getLado() > o.getLado()){
//				resultado=+1;
//			} else {
//				resultado=0;
//			}
			
			
		}
		return resultado;
	}

	

}
