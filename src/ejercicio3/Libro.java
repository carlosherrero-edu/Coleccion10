package ejercicio3;

import java.time.LocalDate;

/**
 * Clase para almacenar Objetos de tipo Libro. que además se pueden prestar
 * @author Carlos Herrero
 * @version 1.0
 *
 */
public class Libro extends Publicacion implements Prestable {
	
	/**
	 * Constante con la duracion de los préstamos en meses
	 */
	final long DURACION_PRESTAMO=1L; 
	
	/**
	 * Constante con el nombre del subtipo de publicación 
	 */
	final String SUBTIPO="Libro";
	
	//propiedades privadas
	private boolean prestado;
	private LocalDate fechaDevolucion;
	

	/**
	 * Constructor único de la clase. Inicializa las propiedades recibidas del padre y marca el libro como disponible
	 * @see ejercicio4.Publicacion#Publicacion()
	 * @param cod: String
	 * @param tit: String
	 * @param año:int
	 */
	public Libro (String cod, String tit, int año){
		
		super(cod, tit, año);
		//el libro al principio no está prestado
		this.setPrestado(false);
		
	}
	
	//métodos get y set
	

	public boolean isPrestado() {
		return prestado;
	}



	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}



	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}



	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}



	/* (non-Javadoc)
	 * @see ejercicio4.Prestable#prestar()
	 */
	@Override
	public LocalDate prestar() {
		
		LocalDate fechaDevolucion=null;
		
		if (!this.isPrestado()){
			//se marca como prestado
			this.setPrestado(true);
			
			fechaDevolucion = LocalDate.now().plusMonths(DURACION_PRESTAMO);
			this.setFechaDevolucion(fechaDevolucion);
		}
		return fechaDevolucion;
	}

	/* (non-Javadoc)
	 * @see ejercicio4.Prestable#devolver()
	 */
	@Override
	public void devolver() {
		if (this.isPrestado()){
			//se devuelve el libro
			this.setPrestado(false);
			this.setFechaDevolucion(null);
			
		}
		

	}

	/* (non-Javadoc)
	 * @see ejercicio4.Prestable#prestado()
	 */
	@Override
	public LocalDate prestado() {
		return this.getFechaDevolucion();
	}
	
	/* (non-Javadoc)
	 * @see ejercicio4.Publicacion#toString()
	 */
	@Override
	public String toString(){
		return SUBTIPO+"\t"+super.toString() +String.format("\t FEcha de devolución: %s",
								this.getFechaDevolucion()!=null ? this.getFechaDevolucion(): "NO prestado");
	}

}
