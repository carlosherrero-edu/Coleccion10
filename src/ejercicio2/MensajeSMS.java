package ejercicio2;


/**
 * Clase que registra mensajes enviados por SMS
 * @author CarlosH
 * @version 1.0
 *
 */

public class MensajeSMS extends MensajeCorto {
	
    /**
     * NACIONAL: double constante con el coste de un mensaje a un número nacional
     */
    final double NACIONAL = 0.15;
    
    /**
     * INTER: double constante con el coste de un mensaje a un número extranjero
     */
    final double INTER = 0.45;

    /**
     * Constructor único de la clase, que asigna todas sus propiedades, reutilzando el constructor del padre
     * @param mensaje: String 
     * @param telefono: String
     * @param correo: String
     */
    public MensajeSMS(String mensaje, String telefono, String correo) {
        super(mensaje, telefono, correo);
        
        
    }
    
    /* (non-Javadoc)
     * @see ejercicio7.Facturable#facturar()
     * Si el teléfono empieza por "0", se factura como internacional; en otro caso, como nacional
     */
    @Override
    public double facturar() {
        double importe;
        if (this.getTelefono().matches("^0\\d+")) {
            importe = INTER;
            
        } else {
            importe = NACIONAL;
        }
        
        return importe;
    }
    
    /* (non-Javadoc)
     * @see ejercicio7.MensajeCorto#enviarMensaje()
     * Muestra el número de envío y el coste de la facturación
     */
    public String enviarMensaje() {
        String mensaje = "";
        if (this.getMensaje().isEmpty()) {
            mensaje = "El texto del mensaje est� vacio";
        } else {
            mensaje = "Mensaje enviado al numero" + this.getTelefono() + " con un coste de " + facturar() + " euros";
        }
        
        return mensaje;
    }
    
    

}
