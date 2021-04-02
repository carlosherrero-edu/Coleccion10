package ejercicio3;

import java.time.LocalDate;

/**
 * Clase abstracta para definir tipos de publicaciones
 * @author Carlos Herrero
 * @version 1.0
 *
 */
public abstract class Publicacion {
	
	//propiedades de la clase
	private String codigo;
	private String titulo;
	private int año;
	
	
	/**
	 * Constructor por defecto, sin parámetros
	 */
	public Publicacion(){
		//no hace nada
	}
	
	/**
	 * Constructor que inicializa todos los parámetros
	 * @param cod: String código de la publicación
	 * @param tit: String título de la publicación
	 * @param año: año de publicación
	 */
	public Publicacion (String cod, String tit, int año){
		this.setCodigo(cod);
		this.setTitulo(tit);
		this.setAño(año);
		
	//métodos get y set	
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAño() {
		return año;
	}
	/**
	 * Método para asignar el año de la publicación
	 * El año debe estar comprendido entre 1500 y la fecha actual
	 * @param año: int-  año de publicación
	 */
	public void setAño(int año) {
		// el año debe estar entre 1500 y el año actual
		if (año<1500 || año>LocalDate.now().getYear()){
			throw new IllegalArgumentException("Año de publicación imposible");
		}
		this.año = año;
	}
	
	@Override
	public String toString(){
		 return  String.format("Código: %10s \t Título: %80s \t Año publicación:%4d", 
				 				this.getCodigo(), this.getTitulo(), this.getAño());
	}
	
	

}
