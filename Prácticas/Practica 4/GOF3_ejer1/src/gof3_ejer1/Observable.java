/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alex
 */
package gof3_ejer1;

import java.util.ArrayList;


public class Observable {

	ArrayList<Observer> observadores = new ArrayList<>();
	
	public void add(Observer o){
		this.observadores.add(o);	
	}
	
	
	public void notifyObserver(Object data) {
		for(Observer o : this.observadores ){
			o.update(this, data);	
		}
	}
}
