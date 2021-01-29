/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof2_ejer1;

import java.io.File;

/**
 *
 * @author Alex
 */
public class CalculadoraNomina {
	
	
	public Nomina calcularNomina(Empleado empleado){
		
		String escala = empleado.getEscala();
		int anhosTrabjados = empleado.getAnhosTrabajados();
		String CargoGestion = empleado.getCargoGestion();
		
		Nomina nomina = getEscalaNomina(escala);
		Nomina complemento = getComplementoAntiguedad(nomina, anhosTrabjados);
		Nomina complementoCargoGestion = getComplementoGestion(complemento, CargoGestion);
		
		return complementoCargoGestion;
		
		
	}
	
	public Nomina getEscalaNomina(String escala){
		
		Nomina aux = null;
                //Aqui se añaden más escalas
		switch(escala){
			
			case "A": aux = new EscalaA();
					  break;
						
			case "B": aux = new EscalaB();
					  break;
			
			case "C": aux = new EscalaC();
					  break;
		}
		
		return aux;
		
	}
	
	public Nomina getComplementoAntiguedad(Nomina base, int anhosTrabajados){
		
		Complemento trienios = new Trienio(base,anhosTrabajados);
		Complemento quinquenios = new Quinquenio(trienios,anhosTrabajados);
		Complemento sexenios = new Sexenio(quinquenios,anhosTrabajados);
		
		return sexenios;
		
	}
	
	public Nomina getComplementoGestion(Nomina base, String CargoGestion){
		
		Nomina aux;
		
		if(CargoGestion.equals("SI")){
			aux = new CargoDeGestion(base);
		}else{
			aux = base;
		}
		
		return aux;
		
	}

}
