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
public class Trienio extends Complemento {
	
	private int anhosTrabajado;
	
	public Trienio(Nomina base, int anhosTrabajado){
		
		super(base);
		this.anhosTrabajado = anhosTrabajado;
		
	}
	
	public int calcularNomina(){
		
		int nomina = this.base.calcularNomina() + ((this.anhosTrabajado/3) * 10);

		return nomina;
		
	}

}
