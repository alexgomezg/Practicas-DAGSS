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
public class Empleado {
	
	private String nombre;
	private String escala;
	private int anhosTrabajados;
	private String CargoDeGestion;
	
	public Empleado(String nombre, String escala, int anhosTrabajados, String CargoDeGestion){
		
		this.nombre = nombre;
		this.escala = escala;
		this.anhosTrabajados = anhosTrabajados;
		this.CargoDeGestion = CargoDeGestion;
		
	}
	
	public void setNombre(String nombre){		
		this.nombre = nombre;
	}
	
	public void setEscala(String escala){
		
		this.escala = escala;
	}
	
	public void setAnhosTrabajados(int anhosTrabajados){
		
		this.anhosTrabajados = anhosTrabajados;
	}
	
	public void setCargoGestion(String CargoGestion){
		
		this.CargoDeGestion = CargoGestion;
	}
	
	public String getNombre(){
		
		return this.nombre;
	}
	
	public String getEscala(){
		
		return this.escala;
	}
	
	public int getAnhosTrabajados(){
		
		return this.anhosTrabajados;
	}
	
	public String getCargoGestion(){
		
		return this.CargoDeGestion;
	}

}
