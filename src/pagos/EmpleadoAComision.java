package pagos;

public class EmpleadoAComision extends Empleado {
	
	//propiedades
	private double ventasSemanales;
	private double comision;

	public EmpleadoAComision(String nombre, String apellidos, String numSegSocial, double ventasSem, double comision) {
		super(nombre, apellidos, numSegSocial);
		try {
			setVentasSemanales(ventasSem);
			setComision (comision);
			
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	public double getVentasSemanales() {
		return ventasSemanales;
	}

	public void setVentasSemanales(double ventasSemanales) {
		if ( ! (ventasSemanales>0)) {
			throw new IllegalArgumentException("Las ventas deben ser mayores de 0");
		}
		this.ventasSemanales = ventasSemanales;
	}

	public double getComision() {
		
		return comision;
	}

	public void setComision(double comision) {
		if (comision<0 || comision>100) {
			throw new IllegalArgumentException("El porcentaje de comisión debe estar entre 0 y 100");
		}
		this.comision = comision;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s --- Ventas Semanales:%.2f -- Comisión: %.2f%% ", super.toString(),
				getVentasSemanales(), getComision());
	}


	@Override
	public double calculaImporteAPagar() {
		
			double importeAPagar;
			importeAPagar= (getVentasSemanales()*getComision())/100;
			return importeAPagar;
	}

}
