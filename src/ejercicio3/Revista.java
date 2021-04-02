package ejercicio3;

/**
 * Clase para almacenar Objetos de tipo Revista
 * @author Carlos Herrero
 * @version 1.0
 */
public class Revista extends Publicacion {
	
	/**
	 * Constante con el nombre del subtipo de publicación 
	 */
	final String SUBTIPO="Revista";
	
	/**
	 * Constructor único de la clase. Inicializa las propiedades recibidas del padre
	 * @see ejercicio4.Publicacion#Publicacion()
	 * @param cod: String
	 * @param tit: String
	 * @param año:int
	 */
	public Revista (String cod, String tit, int año){
		super(cod, tit, año);
	}
	
	
	public String toString(){
		return SUBTIPO+ "\t"+super.toString();
	}

}
