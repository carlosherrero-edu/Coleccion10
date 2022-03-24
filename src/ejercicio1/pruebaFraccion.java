package ejercicio1;

public class pruebaFraccion {

	public static void main(String[] args) {
		

		Fraccion f = new Fraccion(3, 4);
		Fraccion f1 = new Fraccion(2, 5);
		
		System.out.format("(%d/%d)", f.num, f.denum);
		
		
		System.out.println(f.suma(f1));
		System.out.println(f.resta(f1));
		System.out.println(f.producto(f1));
		System.out.println(f.cociente(f1));
		
		try {
			Fraccion f0= new Fraccion(20,0);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
