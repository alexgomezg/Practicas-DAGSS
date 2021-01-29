/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof2_ejer2;

/**
 *
 * @author Alex
 */
import java.util.Observable;
import java.util.Observer;

public class Monitorizador implements Observer {
	
	private int numProgramas = 0;
	private TrabajoObserver observado;
	public synchronized void update(Observable observado, Object data){
		
		this.observado = (TrabajoObserver)observado;
		
	
		if(this.observado.getFinalizado()){
			this.numProgramas += -1;
			System.out.println("Programa finalizado");	
		}else{
			this.numProgramas += 1;
			System.out.println("Programa creado");
		}
		System.out.println("Hay "+this.numProgramas + " programas en curso");
			
	}
	
}
