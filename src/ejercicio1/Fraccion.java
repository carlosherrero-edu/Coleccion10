package ejercicio1;

public class Fraccion implements Operable<Fraccion> {

	private int num;
	private int denum;

	public Fraccion(int num, int denum) {
		if (denum==0) {
			throw new IllegalArgumentException("El denominador no puede ser 0");
		}
		this.num = num;
		this.denum= denum;
	}

	//getters 
	public int getNum() {
		return num;
	}

	public int getDenum() {
		return denum;
	}

	@Override
	public Fraccion suma(Fraccion elemento) {
		Fraccion operacion;
		int numSuma = getNum() * elemento.getDenum() + getDenum()* elemento.getNum();
		int denumSuma = getDenum()* elemento.getDenum();
		operacion = new Fraccion(numSuma, denumSuma);
		return operacion;

	}

	@Override
	public Fraccion resta(Fraccion elemento) {
		Fraccion operacion;
		int numResta = getNum() * elemento.getDenum() - getDenum()* elemento.getNum();
		int denumResta = getDenum()* elemento.getDenum();
		operacion = new Fraccion(numResta, denumResta);
		return operacion;
	}

	@Override
	public Fraccion producto(Fraccion elemento) {
		Fraccion operacion;
		int numPro = getNum() * elemento.getNum();
		int denumPro = getDenum()* elemento.getDenum();
		operacion = new Fraccion(numPro, denumPro);
		return operacion;
	}

	@Override
	public Fraccion cociente(Fraccion elemento) {
		Fraccion operacion;
		int numCo = getNum() * elemento.getDenum();
		int denumCo = getDenum()* elemento.getNum();
		operacion = new Fraccion(numCo, denumCo);
		return operacion;
	}
	
	public String toString() {
		return String.format("(%d/%d)", getNum(),getDenum());
	}

}
