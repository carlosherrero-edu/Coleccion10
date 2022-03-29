package ejercicio6;

public class Futbolista implements Comparable<Futbolista> {

	// propiedades

	private String dni;
	private String nombre;
	private int edad;
	private int goles;

	final String PATRON_DNI = "^[0-9]{8}[A-Z]$";

	public Futbolista(String dni, String nombre, int edad, int goles) {
		try {
			setDni(dni);
			setNombre(nombre);
			setEdad(edad);
			setGoles(goles);
		} catch (Exception e) {
			throw e;
		}
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		
		if (dni.matches(PATRON_DNI)) {
			this.dni = dni;
		} else {
			throw new IllegalArgumentException("El DNI debe tener 8 dígitos y 1 letra");
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre.length()>=5 && nombre.length()<=100) {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("El nombre debe tener entre 5 y 100 caracteres");
		}
	
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad>=16 && edad<=99) {
			this.edad = edad;
		} else {
			throw new IllegalArgumentException("La edad debe estar entre 16 y 99");
		}
		
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles){
		if (goles>=0) {
			this.goles = goles;
		} else {
			throw new IllegalArgumentException("Los goles no pueden ser negativos");
		}
	
	}
	
	
	/**
	 *
	 */
	
	public String toString() {

		return String.format("%9s  %-30s, %d años\n",
				this.getDni(), this.getNombre(), this.getEdad());
	}
	
	
	@Override
	public boolean equals(Object otro) {

		boolean sonIguales = false;
		if (otro instanceof Futbolista) {
			Futbolista otroContacto = (Futbolista) otro;
			if (getDni().equals(otroContacto.getDni())) {
				sonIguales = true;
			}
		}
		return sonIguales;
	}

	@Override
	public int compareTo(Futbolista o) {
		// TODO Auto-generated method stub
		
		return this.getDni().compareTo(o.getDni());
	}

}
