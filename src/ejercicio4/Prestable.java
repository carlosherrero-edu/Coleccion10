package ejercicio4;

import java.time.LocalDate;

/**
 * Clase de tipo Interface para objetos que pueden prestarse durante un período
 * @author CArlos Herrero
 * @version 1.0
 *
 */
public interface Prestable {
	
	/**
	 * Método que comprueba si el objeto está disponible. En caso afirmativo:
	 * - lo marca como prestado
	 * - calcula y retorna la fecha de devolución
	 * @return Localdate: fecha de devolución del objeto / null si el objeto está ya prestado
	 */
	public LocalDate prestar();
	
	/**
	 * Método que realiza la devolución de un objeto ya prestado. Es decir:
	 * - marca el objeto como disponible
	 * - borra su fecha de devolución
	 * 
	 */
	public void devolver();
	
	/**
	 * Método que devuelve la fecha prevista de devolución de un objeto
	 * @return LocalDate - fecha de devolución prevista / null si no está prestado
	 */
	public LocalDate prestado();

}
