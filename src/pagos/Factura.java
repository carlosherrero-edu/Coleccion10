package pagos;

public class Factura implements Pagadero {

	// propiedades
	private int numProducto;
	private String descripcion;
	private int cantidad;
	private double precioUnidad;

	public Factura(int numProducto, String descripcion, int cantidad, double precioUnidad) {
		try {
			setNumProducto(numProducto);
			setDescripcion(descripcion);
			setCantidad(cantidad);
			setPrecioUnidad(precioUnidad);
		} catch (IllegalArgumentException e) {
			throw e;
		}

	}

	// getters y setters

	public int getNumProducto() {
		return numProducto;
	}

	public void setNumProducto(int numProducto) {
		this.numProducto = numProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if (cantidad <= 0) {
			throw new IllegalArgumentException("El número de artículos debe ser positivo");
		}
		this.cantidad = cantidad;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		if (precioUnidad <= 0) {
			throw new IllegalArgumentException("El precio por unidad debe ser positivo");
		}
		this.precioUnidad = precioUnidad;
	}
	
	@Override
	public String toString() {
		return String.format("Código:%d -  Descripción:%30s - Cantidad:%d -  Precio por unidad:%.2f € \n",
							getNumProducto(), getDescripcion(), getCantidad(), getPrecioUnidad());
	}

	@Override
	public double calculaImporteAPagar() {
		
		return  getCantidad()*getPrecioUnidad();
	}

}
