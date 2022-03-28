package entidad;

public class Jefe extends Empleado{
	private double incentivos;

	@Override
	public double sueldoFinal() {
		
		return sueldoBase + incentivos;
	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

}
