package pagos;

public class EmpleadoFijo extends Empleado {
	
	static final double SALARIO_DEFECTO=500;
	
	//propiedad
	private double salarioSemanal;

	public EmpleadoFijo(String nombre, String apellidos, String numSegSocial, double salarioSemanal) {
		super(nombre, apellidos, numSegSocial);
		try {			
			setSalarioSemanal(salarioSemanal);
		
		} catch (IllegalArgumentException e) {
			this.salarioSemanal=SALARIO_DEFECTO;
			
		}
	}

	//getters y setters
	
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		if (salarioSemanal<=0) {
			throw new IllegalArgumentException("El salario debe ser mayor de 0");
		}
		this.salarioSemanal = salarioSemanal;
	}
	
	@Override
	public String toString() {
		return String.format("%s -- Salario: %.2f € \n", 
								super.toString(), getSalarioSemanal());
		
	}

	@Override
	public  double calculaImporteAPagar() {
		return getSalarioSemanal();
	}

}
