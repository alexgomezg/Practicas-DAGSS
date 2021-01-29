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
import java.util.ArrayList;

public class Paralelo extends Trabajo{
	
	public Paralelo(){
		super();
	}
	
	public void run(){
		
		ArrayList<Thread> hilosHijos = new ArrayList<>();
		
		for(Runnable r : this.programas){
			Thread t = new Thread(r);
			hilosHijos.add(t);
			t.start();	
		}
		
		for(Thread t : hilosHijos){
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	public void addprograma(Runnable r){
		super.addprograma(r);
		
	}
}
