package ejercicio4;

enum Formatos {
	WAV, MP3, WMA, AVI, MOV, MP4, WMV, SWF
};

public class Multimedia {

	// propiedades de la clase
	private String titulo;
	private String autor;
	private int duracion;
	private Formatos formato;

	// constructor
	public Multimedia(String tit, String aut, int dur, Formatos forma) {

		setTitulo(tit);
		setAutor(tit);
		setDuracion(dur);
		setFormato(forma);
	}

	// métodos get y set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Formatos getFormato() {
		return formato;
	}

	public void setFormato(Formatos formato) {
		this.formato = formato;
	}

	// métodos sobreescritos de la clase Object
	@Override
	public String toString() {
		return "Título  :" + this.titulo + "*Autor :" + this.autor + "*Duración en minutos :" + this.duracion
				+ "*Formato :" + this.formato;

	}

	@Override
	public boolean equals(Object otroMulti) {
		boolean sonIguales = false;
		if (otroMulti instanceof Multimedia) {
			if (((Multimedia) otroMulti).getAutor() == this.autor
					&& ((Multimedia) otroMulti).getTitulo() == this.titulo) {
				sonIguales = true;
			}
		}
		//en cualquier otro caso, no pueden ser iguales y devolveremos false

		return sonIguales;

	}
}
