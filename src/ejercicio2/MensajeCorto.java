package ejercicio2;


/**
 * Clase para almacenar un mensaje corto
 * @author Carlos H.
 * @version 1.0
 *
 */
public  abstract class MensajeCorto implements Facturable{
	
	//propiedades de la clase
	private String mensaje;
	private String telefono;
	private String correo;
	
	/**
	 * Constructor por defecto, sin parÃ¡metros
	 */
	public MensajeCorto(){
	
	}
	
	
	/**
	 * Constructor que asigna todas las propiedades de la clase
	 * @param mensaje: String texto del mensaje
	 * @param correo: String direcciÃ³n electrÃ³nica de envÃ­o
	 * @param telefono: STring telÃ©fono de envÃ­o
	 */
	public MensajeCorto (String mensaje, String correo, String telefono){
		try {
			this.setMensaje(mensaje);
			this.setCorreo(correo);
			this.setTelefono(telefono);
		} catch (IllegalArgumentException e) {
			throw e ;    //relanzamos la excepción que haya podido originarse
		}
		
		
	}
	
	
	public String getMensaje() {
		return mensaje;
	}
	/**
	 * ValidaciÃ³n y asignaciÃ³n de la propiedad mensaje
	 * @param mensaje: String texto del mensaje
	 * @exception IllegalArgumentException: si el texto del mensaje excede 160 caracteres
	 */
	public void setMensaje(String mensaje) {
		if(mensaje.length()>160){
            throw new IllegalArgumentException("El mensaje supera los 160 caracteres");
         }
        this.mensaje = mensaje;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	/**
	 * ValidaciÃ³n y asignaciÃ³n de la propiedad telefono
	 * @param telefono: String con el nÃºmero de telÃ©fono de envÃ­o
	 * @exception IllegalArgumentException: si el telÃ©fono no consta al menos de 9 dÃ­gitos
	 */
	public void setTelefono(String telefono) {
		if (telefono.length()>0){
			if (!telefono.matches("\\d{9,}")){
				throw new IllegalArgumentException("Telefono incorrecto");
			}
			this.telefono = telefono;
		}
		//si el telÃ©fono estÃ¡ vacÃ­o, no hace nada
		
	}
	
	
	public String getCorreo() {
		return correo;
	}
	
	
	/**
	 * ValidaciÃ³n y asignaciÃ³n de la propiedad correo
	 * @param correo: String con el correo electrÃ³nico de envÃ­o
	 * @exception IllegalArgumentException: si el correo no sigue el formato "nombre@subdominio.dominio, con al menos 2 dominios
	 */
	public void setCorreo(String correo) {
		 String patronCorreo="^\\w+@(\\w+\\.)+\\w+$";
	        
	        if (correo.length()>0) {
	            if (!correo.matches(patronCorreo)) {
	                
	                throw new IllegalArgumentException("El email tiene que tener el formato: \"nombre@subdominio.dominio\".");
	            
	            }
	            
	            this.correo = correo;

	        }
	}
	
	/**
	 * MÃ©todo abstracto que realiza el envÃ­o del mensaje
	 * @return:String - informaciÃ³n sobre el resultado del envÃ­o y su coste
	 */
	public abstract String enviarMensaje();

}
