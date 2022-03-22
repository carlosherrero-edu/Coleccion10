package pagos;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pagadero> lista = new ArrayList<>();

		Factura miFactura = new Factura(9999, "Paquetes folios A4", 100, 4.50);

		EmpleadoFijo empleado1 = new EmpleadoFijo("Pepito", "Pérez", "1234567890", 1000);

		EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Pepita", "Castro", "2345678901", 45, 35);

		EmpleadoAComision empleado3 = new EmpleadoAComision("Juanita", "Rodriguez", "3456789012", 6000, 15);

		// agrego todos los objetos en la lista
		lista.add(miFactura);
		lista.add(empleado1);
		lista.add(empleado2);
		lista.add(empleado3);
		
		for (Pagadero item : lista) {
			System.out.println( "Soy de la clase :" + item.getClass());
			System.out.format("Me tienen que pagar %.2f Euros\n", item.calculaImporteAPagar());
			if (item instanceof Empleado) {
				System.out.format(" Nombre: %s -- Apellidos %s \n", 
						((Empleado)item).getNombre(), ((Empleado)item).getApellidos());
				
			} else {
				//es de la clase Factura
				System.out.format(" Código de producto: %d -- Artículo %s \n", 
						((Factura)item).getNumProducto(), ((Factura)item).getDescripcion());
			}
		}

	}

}
