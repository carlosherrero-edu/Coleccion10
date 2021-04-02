package ejercicio2;



/**
 * @author alumno
 *
 */
public class MensajeEmail extends MensajeCorto {

	/**
     * Constructor √∫nico de la clase, que asigna todas sus propiedades, reutilzando el constructor del padre
     * @param mensaje: String 
     * @param telefono: String
     * @param correo: String
     */
    public MensajeEmail(String mensaje, String telefono, String correo) {
        super(mensaje, telefono, correo);
     
    }
    
    /* En este caso, s√≥lo muestra la direcci√≥n electr√≥nica a la que se env√≠a
     * (non-Javadoc)
     * @see ejercicio7.MensajeCorto#enviarMensaje()
     */
    @Override
    public String enviarMensaje() {
        String mensaje = "";
        if (this.getMensaje().isEmpty()) {
            mensaje = "El texto del mensaje est· vacio";
        } else {
            mensaje = "Mensaje enviado a la direcciÛn electrÛnica " + this.getCorreo();
        }
        
        return mensaje;
        
    }

}
