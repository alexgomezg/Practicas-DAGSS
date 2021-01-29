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
public class Serie extends Trabajo{
	public Serie(){
		super();
		
	}
	
	public void run(){
		
		for(Runnable r : this.programas){
			
			r.run();
		}
		
		
	}
	
	public void addprograma(Runnable r){
		super.addprograma(r);
		
	}

}
