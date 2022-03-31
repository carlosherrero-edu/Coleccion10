package ejercicio2;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		LocalDate hoy=LocalDate.now();
		hoy.plusMonths(1);
		
		System.out.println("La fecha actual es " +hoy);
		System.out.println("La fecha dentro de un mes será " +hoy.plusMonths(1L));

	}

}
