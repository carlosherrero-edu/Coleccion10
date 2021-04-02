package ejercicio4;

import java.time.LocalDate;

public class DiscoPrestable extends Disco implements Prestable {
	
	//atributos propios de la clase
	private boolean prestado;
	private LocalDate fechaDevolucion;

	//constante con la duración en semanas del préstamo de un disco
	final long DURACION_PRESTAMO=1L;
	/**
	 * @param tit título del disco
	 * @param aut nombre del autor
	 * @param dur duración en minutos
	 * @param forma formato del disco, elegido del tipo enumerado Formatos
	 * @param gen género musical al que pertenece, elegido del tipo enumerado Generos
	 * @param pistas número de pistas
	 */
	public DiscoPrestable(String tit, String aut, int dur, Formatos forma, Generos gen, int pistas) {
		super(tit, aut, dur, forma, gen, pistas);
		// inicialmente no puede estar prestado, 
		this.prestado =false;
	}

	//métodos get y set de la clase
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
			
			fechaDevolucion = LocalDate.now().plusWeeks(DURACION_PRESTAMO);
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

}
