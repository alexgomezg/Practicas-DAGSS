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
public class ProgramaC implements Runnable{
	
  public void run(){
	  
    try{ 
    	
      System.out.println("[INICIO] ProgramaC");
      Thread.sleep(10); 
      System.out.println("[FIN] ProgramaC"); 
      
    }catch(InterruptedException e){ 
    	
    	throw new RuntimeException(e);
    	
    } 
  } 
}