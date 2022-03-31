package ejercicio3;

import java.time.LocalDate;

public abstract class Publicacion {

	private String codigo;
	private String titulo;
	private int año;

	public Publicacion() {
	}

	public Publicacion(String cod, String tit, int año) {
		try {
			this.codigo = cod;
			this.titulo = tit;
			setAño(año);
		} catch (Exception e) {
			throw e;
		}
		
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

	public void setAño(int año) {
		if (año >= 1500 && año < LocalDate.now().getYear()) {
			this.año = año;
		}else {
		
			throw new IllegalArgumentException("El año debe estar entre 1500 y el año actual");
		}

	}

	public String toString() {
		return String.format("Codigo:%s -- Titulo: %s -- año:%4d", super.toString(), getCodigo(), getTitulo(),
				getAño());
	}

}
