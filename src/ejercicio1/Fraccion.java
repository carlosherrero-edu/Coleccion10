package ejercicio1;

public class Fraccion implements Operable<Fraccion> {

	// Propiedades de clase

	private int numerador;

	private int denominador;

	public Fraccion(int num, int denom) {
		try {
			setNumerador(num);
			setDenominador(denom);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	// metodos set y get

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		if (denominador != 0) {
			this.denominador = denominador;
		} else {
			throw new IllegalArgumentException(" El denominador no puede ser 0");
		}

	}

	// metodo de la interfaz

	@Override
	public Fraccion suma(Fraccion elemento) {

		int num = elemento.getNumerador();
		int den = elemento.getDenominador();

		int resnum = this.numerador * den + this.denominador * num;
		int resden = this.denominador * den;

		Fraccion f = new Fraccion(resnum, resden);
		return f;

	}

	@Override
	public Fraccion resta(Fraccion elemento) {

		int num = elemento.getNumerador();
		int den = elemento.getDenominador();

		int resnum = this.numerador * den - this.denominador * num;
		int resden = this.denominador * den;

		Fraccion f = new Fraccion(resnum, resden);
		return f;

	}

	@Override
	public Fraccion producto(Fraccion elemento) {

		int num = elemento.getNumerador();
		int den = elemento.getDenominador();

		int resnum = this.numerador * num;
		int resden = this.denominador * den;

		Fraccion f = new Fraccion(resnum, resden);
		return f;

	}

	@Override
	public Fraccion cociente(Fraccion elemento) {

		int num = elemento.getNumerador();
		int den = elemento.getDenominador();

		int resnum = this.numerador * den;
		int resden = this.denominador * num;

		Fraccion f = new Fraccion(resnum, resden);
		return f;

	}

	public String toString() {

		return this.numerador + "/" + this.denominador;
	}
}
