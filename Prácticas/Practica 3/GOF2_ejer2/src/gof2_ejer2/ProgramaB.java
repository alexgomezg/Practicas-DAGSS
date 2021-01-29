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
public class ProgramaB extends TrabajoObserver{
	
  public void start(){
	  
    try{ 
    	
      System.out.println("[INICIO] ProgramaB");
      Thread.sleep(10); 
      System.out.println("[FIN] ProgramaB"); 
      
    }catch(InterruptedException e){ 
    	
    	throw new RuntimeException(e);
    	
    } 
  } 
}