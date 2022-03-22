package pagos;

public abstract class Empleado implements Pagadero {
	
	//propiedades
	private String nombre;
	private String apellidos;
	private String numSegSocial;
	
	//constructor

	public Empleado(String nombre, String apellidos, String numSegSocial) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numSegSocial = numSegSocial;
	}
	
	//getters y setters
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNumSegSocial() {
		return numSegSocial;
	}

	public void setNumSegSocial(String numSegSocial) {
		this.numSegSocial = numSegSocial;
	}
	
	@Override
	public String toString() {
		return String.format("Apellidos:%30s - Nombre:%30s - Número Seg Social: %10s",
							getApellidos(), getNombre(), getNumSegSocial());
	}

	

}
