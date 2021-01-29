/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof2_ejer1;

/**
 *
 * @author Alex
 */
public abstract class Complemento implements Nomina {
	
	protected Nomina base;
	
	public Complemento(Nomina base){
		this.base = base;
		
	}
	
        @Override
	public abstract int calcularNomina();

}
