package entidad;

public class Trabajador extends Empleado{
	
	private int valoracion;

	@Override
	public double sueldoFinal() {
		
		double extra = 0.0;
		 if(this.valoracion== 5 || this.valoracion==6) {
			 extra = 50.0;
		}
		 if(this.valoracion== 7 || this.valoracion==8) {
			 extra=100.0;
		 }
		 if(this.valoracion== 9 || this.valoracion==10) {
			 extra = 200.0;
		 }
		return sueldoBase + extra;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		
		if(valoracion < 0 || valoracion > 10 ) {
		
			System.out.println("La valoración ha de ser un número entre 0 y 10, sendos incluidos");
		} else {
			this.valoracion = valoracion;
		}
		
	}

}
