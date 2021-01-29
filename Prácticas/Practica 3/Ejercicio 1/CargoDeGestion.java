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
public class CargoDeGestion extends Complemento {
		
	public CargoDeGestion(Nomina base){
		
		super(base);
		
	}
	
	public int calcularNomina(){

		int nominaCargoGestion = this.base.calcularNomina() + 15;
		return nominaCargoGestion;
		
	}

}
