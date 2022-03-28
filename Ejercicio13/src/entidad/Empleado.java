package entidad;

public abstract class Empleado {

	protected String nombre;
	protected double sueldoBase;
	
	/**
	 * Método que herederán cada uno de los tipos distintos empleados que componen el modelo de clases y que sirve para calcular su sueldo final con
	 * considerando su sueldo base y lo que se suma en su caso por el extra definido.
	 *
	 * @param extra que se usa, según la regla aplicada el tipo concreto de empleado, para obtener el sueldo final del empleado.
	 * @return devuelve el valor del sueldo final.
	 */
	public abstract double sueldoFinal();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
}
