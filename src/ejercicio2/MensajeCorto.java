package ejercicio2;

public abstract class MensajeCorto implements Facturable{

	//Propiedades
	private String mail;
	private String mensaje;
	private String telefono;
	
	//Expresiones regulares
	final String PATRON_MAIL="^\\w+[@](\\w+\\.){1,}(\\w+)$";
	final String PATRON_MENSAJE=".{,160}";
	final String PATRON_TELEFONO="^\\d{9,}$";

	
	
	//Constructor
	
	public MensajeCorto(String mail, String mensaje, String telefono) {
		super();
		try {
		setMail(mail);
		setMensaje(mensaje);
		setTelefono(telefono);
		}catch(IllegalArgumentException e){throw e;}
	}

	//Getters & Setters 

	public String getmail() {
		return mail;
	}


	public void setMail(String mail) {
		String validar=mail;
		if(!validar.matches(PATRON_MAIL)) {
			throw new IllegalArgumentException("El mail introducido no es válido.\n");
		}
		this.mail = mail;
	}


	public String getmensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		String validar=mensaje;
		if(!validar.matches(PATRON_MENSAJE)) {
			throw new IllegalArgumentException("El mensaje solo puede contener 160 caracteres.\n");
		}
		this.mensaje = mensaje;
	}


	public String gettelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		
		if(!telefono.matches(PATRON_TELEFONO)) {
			throw new IllegalArgumentException("El Nº de teléfono tiene que tener al menos 9 dígitos.\n");
		}
		this.telefono = telefono;
	}
	
	public abstract String enviarMensaje();
}
		
	//	return //String.format("Para: %s\n -- Mensaje: %s\n -- Nº teléfono: %s\n"