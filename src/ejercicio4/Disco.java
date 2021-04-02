package ejercicio4;

 /**
  * Tipo enumerado con los géneros musicales posibles para un disco
 * @author Carlos H.
 *
 */
enum Generos {POP, ROCK, JAZZ, COUNTRY, INDIE}

/**
 * @author cherre1
 * Clase disco que  hereda de la clase Multimedia e incorpora 2 nuevos campos
 * Género:  tipo enumerado con el género al que pertenece el disco
 * pistas: número de pistas o canciones
 */
public class Disco extends Multimedia {
	
	
	
	//propiedades de la clase
	/**
	 * genero:  tipo enumerado con el género al que pertenece el disco
	 */
	private Generos genero;
	/**
	 * pistas: valor entero con el número de pistas o canciones
	 */
	private int pistas;
	
	//constructor con todos los parámetros
		public Disco(String tit, String aut, int dur, Formatos forma, Generos gen, int pistas){
			super(tit,aut,dur,forma);
		
			this.genero = gen;
			this.pistas =pistas;
				
		}
		
		//métodos get y set
		public Generos getGenero() {
			return genero;
		}

		public void setGenero(Generos genero) {
			this.genero = genero;
		}

		public int getPistas() {
			return pistas;
		}

		public void setPistas(int pistas) {
			this.pistas = pistas;
		}
		
		//sobreescribimos el método toString del padre
		/** Método sobreescrito de la clase padre, ampliando el género y las pistas
		 * @see Coleccion9.Multimedia#toString()
		 */
		@Override
		public String toString(){
			 return super.toString() +"*Género :"+this.genero +"*Pistas :"+ this.pistas;
		}
		


		

}
