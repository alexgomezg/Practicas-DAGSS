/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof1_ejer3;

/**
 *
 * @author Alex
 */
import java.util.ArrayList;


public abstract class Trabajo implements Runnable {
	
	ArrayList<Thread> programas = new ArrayList<>();
		
	public void addprograma(Runnable r){
		Thread t = new Thread(r);
		this.programas.add(t);
		
	}

}
