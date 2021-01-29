/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof2_ejer1;

/**
 *
 * @author Alex
 * */
import java.util.LinkedList;
import java.util.List;

public class Plantilla {
	
	private List<Empleado> empleados;
	
	public Plantilla(){
		
		this.empleados = new LinkedList<>();
	}
	
	public void addEmpleado(String nombre, String escala, int anhosTrabajados, String CargoGestion){
		
		Empleado emp = new Empleado(nombre,escala,anhosTrabajados,CargoGestion);
		this.empleados.add(emp);
		
	}
	
	public int getSize(){
		
		return this.empleados.size();
		
	}
	
	public Empleado getEmpleado(int i){
		
		return this.empleados.get(i);
		
	}

}
