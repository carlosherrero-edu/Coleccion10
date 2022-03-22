package pagos;

public class EmpleadoPorHoras extends Empleado {

	static final double FACTOR_HORA_EXTRA = 1.5;
	static final double JORNADA_COMPLETA_SEMANAL = 40.0;
	
	// propiedades
	private double horasSemanales;
	private double tarifaHoraria;

	public EmpleadoPorHoras(String nombre, String apellidos, String numSegSocial, double horasSemanales,
			double tarifa) {
		super(nombre, apellidos, numSegSocial);
		try {
			setHorasSemanales(horasSemanales);
			setTarifaHoraria(tarifa);

		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	public double getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(double horasSemanales) {
		if (horasSemanales <= 0) {
			throw new IllegalArgumentException("Las horas semanales tienen que ser más de 0");
		}

		this.horasSemanales = horasSemanales;
	}

	public double getTarifaHoraria() {
		return tarifaHoraria;
	}

	public void setTarifaHoraria(double tarifaHoraria) {
		if (tarifaHoraria <= 0) {
			throw new IllegalArgumentException("La tarifa horaria debe ser mayor de 0");
		}
		this.tarifaHoraria = tarifaHoraria;
	}
	
	@Override
	public String toString() {
		return String.format("%s --- Horas Semanales:%.2f -- Tarifa por horas:%.2f ", super.toString(),
				getHorasSemanales(), getTarifaHoraria());
	}

	@Override
	public double calculaImporteAPagar() {
		if (getHorasSemanales() <= JORNADA_COMPLETA_SEMANAL) {
			return getHorasSemanales() * getTarifaHoraria();
		} else {
			return JORNADA_COMPLETA_SEMANAL * getTarifaHoraria() + (JORNADA_COMPLETA_SEMANAL) * getTarifaHoraria() * FACTOR_HORA_EXTRA;
		}

	}

}
