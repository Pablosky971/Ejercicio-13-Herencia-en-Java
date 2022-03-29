package entidad;

import java.util.List;

public class Directivo extends Empleado {

	
	private List<Empleado> empleadosCargo;
	
	public double sueldoFinal() {
		
		int nEmpleados = this.empleadosCargo.size();
		
		System.out.println("Valor de nEmpleados: " + nEmpleados);		
		double extra = nEmpleados * 100.00;
		
		return sueldoBase + extra;
	}
	
	public List<Empleado> getEmpleadosCargo() {
		return empleadosCargo;
	}

	public void setEmpleadosCargo(List<Empleado> empleadosCargo) {
		this.empleadosCargo = empleadosCargo;
	}


}
