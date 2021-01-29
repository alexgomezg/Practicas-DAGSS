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

public abstract class Operation extends Observable{
	
	private float progres;
	
	public abstract String getName();
	
	public abstract ArrayList<String> getParameterNames();
	
	public abstract String execute(ArrayList<String> parameterValor);//Command
	
	protected void setProgress(float progres) {
		this.progres = progres;		
		super.notifyObserver((Object)getProgress());
	}
	
	protected float getProgress() {
		return progres;
	}

}
