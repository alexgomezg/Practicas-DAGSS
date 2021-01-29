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

abstract class TrabajoObserver extends Observable implements Runnable {
	
	protected boolean finalizado = false;
	
	public void run(){
		
		setChanged();
		notifyObservers();
		
		start();
		
		this.finalizado = true;
		setChanged();
		notifyObservers();
		
	}
	
	public abstract void start();
	
	public boolean getFinalizado(){
		
		return this.finalizado;
	}

}
