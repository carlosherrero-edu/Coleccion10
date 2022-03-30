package ejercicio2;

public class MensajeSMS extends MensajeCorto {

	public static final double TARIFA_NACIONAL = 0.15;
	public static final double TARIFA_INTERNACIONAL = 0.45;
	// expresion regular
	final String PATRON_TELF = "^0\\d*";

	public MensajeSMS(String mail, String mensaje, String telefono) {
		super(mail, mensaje, telefono);
		
	}

	@Override
	public String enviarMensaje() {
		String advertencia="";
		if(getmensaje()=="") {
			advertencia="El texto del mensaje está vacío.";
		}else {
			advertencia=String.format("MEnsaje enviado al número %s con un importe de %.2f €",
									gettelefono(),facturar());
		}
		return advertencia;
	}

	public double facturar() {
		double facturacion;
		if (gettelefono().matches(PATRON_TELF)) {
			facturacion = TARIFA_INTERNACIONAL;
		}else {
		facturacion = TARIFA_NACIONAL;
		}

		return facturacion;
	}

}
