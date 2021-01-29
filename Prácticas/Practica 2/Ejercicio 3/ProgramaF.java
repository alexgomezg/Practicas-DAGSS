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
public class ProgramaF implements Runnable{
	
  public void run(){
	  
    try{ 
    	
      System.out.println("[INICIO] ProgramaF");
      Thread.sleep(10); 
      System.out.println("[FIN] ProgramaF"); 
      
    }catch(InterruptedException e){ 
    	
    	throw new RuntimeException(e);
    	
    } 
  } 
}