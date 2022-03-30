package ejercicio2;


public class MensajeEmail extends MensajeCorto {

	public MensajeEmail(String mail, String mensaje, String telefono) {
		super(mail, mensaje, telefono);
	
	}
	

	
	@Override
	public String enviarMensaje() {
		String advertencia="";
		if(getmensaje().isEmpty()) {
			advertencia="El texto del mensaje está vacío";
		}else {
			advertencia= "Mensaje enviado a la direción electrónica: "+
						getmail();
		}
		return advertencia;
	}

}