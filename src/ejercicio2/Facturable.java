package ejercicio2;

/**
 * Clase de tipo Interface para facturar una comunicación
 * @author Carlos Herrero
 * @version 1.0
 *
 */
public interface Facturable {
	
	 /**
	  * Método que calcula y devuelve el importe de facturación de una comunicación
	  * Por defecto , es 0
	 * @return: double importe a facturar
	 */
	public default double facturar() {
	        return 0.0;
	    }

}
