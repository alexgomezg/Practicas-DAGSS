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
public class Sexenio extends Complemento {
	
	private int anhosTrabajados;
	
	public Sexenio(Nomina base, int anhosTrabajados){
		
		super(base);
		this.anhosTrabajados = anhosTrabajados;
		
	}
	
	public int calcularNomina(){
		
		int nomina = this.base.calcularNomina() + ((this.anhosTrabajados/6) * 50);
		return nomina;
		
	}

}
