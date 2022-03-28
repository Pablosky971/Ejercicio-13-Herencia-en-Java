package main;

import java.util.ArrayList;
import java.util.List;

import entidad.Directivo;
import entidad.Empleado;
import entidad.Jefe;
import entidad.Trabajador;

public class MainEmpleados {

	public static void main(String[] args) {
	
		List<Empleado> le = new ArrayList<>();
		
		
		Jefe j = new Jefe();
		j.setNombre("Manolo");
		j.setSueldoBase(2000.00);
		j.setIncentivos(200.00);
		le.add(j);
		
		j = new Jefe();
		j.setNombre("Pepe");
		j.setSueldoBase(2000.00);
		j.setIncentivos(500.00);
		le.add(j);
		
		Trabajador t = new Trabajador();
		t.setNombre("Pepito Grillo");
		t.setSueldoBase(1300.00);
		t.setValoracion(6);
		le.add(t);
		
		t = new Trabajador();
		t.setNombre("Matilda");
		t.setSueldoBase(1300.00);
		t.setValoracion(8);
		le.add(t);
		
		t = new Trabajador();
		t.setNombre("Ruperta");
		t.setSueldoBase(1300.00);
		t.setValoracion(10);
		le.add(t);
		
		Directivo d = new Directivo();
		d.setNombre("Stefan");
		d.setSueldoBase(3150.50);
		
		int i = 0;
		
		for(i=0;i<=3;i++) {
			d.getEmpleadosCargo().add(le.get(i));
			
		}
		
		le.add(d);
		
		
			int n = 0;
			for(Empleado e : le) {
				if(e instanceof Directivo) {
					e = (Directivo) e;
					double s = e.sueldoFinal();
					System.out.println("El sueldo del directivo " + n + "es: " + s);
				} 
				
				if(e instanceof Jefe) {
					e = (Jefe) e;
					double s = e.sueldoFinal();
					System.out.println("El sueldo del jefe " + n + "es: " + s);
				}
				
				if(e instanceof Trabajador) {
					e = (Trabajador) e;
					double s = e.sueldoFinal();
					System.out.println("El sueldo del trabajador" + n + "es: " + s);
				}
				 
				n++;
			}
			}
			
	} 

	

