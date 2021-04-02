package ejercicio5;

/**
 * Clase para almacenas proyectos de fin de ciclo, que hereda de Publicación
 * @author Carlos H.
 * @version 1.0
 *
 */
public class ProyectoFinCiclo extends Publicacion implements Comparable<ProyectoFinCiclo> {
	
	/**
	 * Constante con el nombre del subtipo de publicación 
	 */
	final String SUBTIPO="Proyecto";
	
	/**
	 * denominacion- String
	 */
	private String denominacion;
	
	/**
	 * Constructor único de la clase
	 *  @see ejercicio4.Publicacion#Publicacion()
	 * @param cod: String
	 * @param tit: String
	 * @param año: int
	 * @param denom: String con la denominación del ciclo
	 */
	public ProyectoFinCiclo(String cod, String tit, int año, String denom){
		super(cod,tit,año);
		this.setDenominacion(denom);
	}

	//métodos get y set
	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * Se comparan por la denominacińo del ciclo y, en caso de igualdad, por el código de publicación
	 */
	@Override
	public int compareTo(ProyectoFinCiclo otroProy)  {
		
		int retorno=0;
		
		int comparacion= this.getDenominacion().compareToIgnoreCase(otroProy.getDenominacion());
		
		if (comparacion>0){
			retorno=1;
		
		} else if (comparacion<0){
			retorno = -1;
			
		} else {
			comparacion = this.getCodigo().compareTo(otroProy.getCodigo());
			if (comparacion>0){
				retorno =1;
				
			} else if (comparacion <0){
				retorno = -1;
				
			} else {
				//no hago nada, devuelvo 0
			}
			
		}
		
		return retorno;
	}
	
	public String toString(){
		return SUBTIPO+ "\t"+super.toString()+ String.format("- Ciclo: %40s", this.getDenominacion());
	}
		
		

}
